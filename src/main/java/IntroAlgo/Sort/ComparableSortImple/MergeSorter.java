package IntroAlgo.Sort.ComparableSortImple;

import java.util.Comparator;

/**
 * Created by lab on 14-8-10.
 */
public class MergeSorter extends ComparableSorter {

    protected void merge(Object[] datas,int p,int q,int r,Comparator comparator){
        int n1 = q-p+1;
        int n2 = r-q;

        Object[] L = new Object[n1];
        Object[] R = new Object[n2];

        for(int i=0;i<n1;i++)
            L[i] = datas[p+i];
        for(int j=0;j<n2;j++)
            R[j] = datas[q+j+1];

        int i=0,j=0,k=p;

        while(i<n1 && j<n2){
            if (comparator.compare(L[i],R[j])<=0){
                datas[k++] = L[i++];
            }else{
                datas[k++] = R[j++];
            }
        }

        while(i<n1){
            datas[k++] = L[i++];
        }

        while(j<n2){
            datas[k++] = R[j++];
        }
    }

    protected void doSort(Object[] datas,int p,int r,Comparator comparator){
        if (p<r){
            int division = (p+r)/2;
            doSort(datas, p, division, comparator);
            doSort(datas, division + 1, r, comparator);
            merge(datas,p,division,r,comparator);
        }
    }

    @Override
    protected void invoke(Object[] datas, Comparator comparator) {
        doSort(datas,0,datas.length-1,comparator);
    }
}

package IntroAlgo.Sort.SortImple;

import IntroAlgo.Sort.AbsSorter.ComparableSorter;

import java.util.Comparator;

/**
 * Created by adam on 14-9-17.
 */
public class QuickSorter extends ComparableSorter{
    protected int partition(Object[] datas,int p,int r,Comparator comparator){
        Object x = datas[r];
        int i = p-1;

        for (int j=p;j<=r-1;j++){
            if (comparator.compare(datas[j],x)<=0){
                i++;
                exchange(datas,i,j);
            }
        }

        exchange(datas,i+1,r);

        return i+1;
    }

    protected void exchange(Object[] datas,int first,int second){
        Object temp = datas[first];
        datas[first] = datas[second];
        datas[second] = temp;
    }

    protected void quickSort(Object[] datas,int p,int r,Comparator comparator){
        if (p<r){
            int q = partition(datas,p,r,comparator);
            quickSort(datas,p,q-1,comparator);
            quickSort(datas,q+1,r,comparator);
        }
    }

    @Override
    protected void invoke(Object[] datas, Comparator comparator) {
        quickSort(datas,0,datas.length-1,comparator);
    }
}

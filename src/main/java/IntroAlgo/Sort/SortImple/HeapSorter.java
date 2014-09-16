package IntroAlgo.Sort.SortImple;

import IntroAlgo.Sort.AbsSorter.ComparableSorter;

import java.util.Comparator;

/**
 * Created by adam on 14-9-16.
 */
public class HeapSorter extends ComparableSorter {

    protected void heapify(Object[] datas,int iStart,int heapSize,Comparator comparator){
        int l = iStart*2+1, r = (iStart+1)*2;
        int largest;

        if (l <= heapSize && comparator.compare(datas[l],datas[iStart])>0)
            largest = l;
        else
            largest = iStart;

        if (r <= heapSize && comparator.compare(datas[r],datas[largest])>0)
            largest = r;

        if (largest != iStart){
            exchangeObject(datas,iStart,largest);

            heapify(datas,largest,heapSize,comparator);
        }
    }

    protected void buildHeap(Object[] datas,Comparator comparator){
        int heapSize = datas.length-1;

        for (int i = heapSize/2; i >=0 ; i--)
            heapify(datas,i,heapSize,comparator);
    }

    protected void heapSort(Object[] datas,Comparator comparator){
        buildHeap(datas,comparator);
        for (int i=datas.length-1; i>=1;i--){
            exchangeObject(datas,0,i);
            heapify(datas,0,i-1,comparator);
        }
    }

    private void exchangeObject(Object[] datas,int first,int second){
        Object temp = datas[first];
        datas[first] = datas[second];
        datas[second] = temp;
    }

    @Override
    protected void invoke(Object[] datas, Comparator comparator) {
        heapSort(datas,comparator);
    }
}

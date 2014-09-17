package IntroAlgo.DataStru.Heap;

import java.util.Comparator;

/**
 * Created by adam on 14-9-17.
 */
public class BaseHeapSort extends BaseHeap implements ISort {

    public BaseHeapSort(){}

    public BaseHeapSort(Object[] datas,Comparator comparator,int heapSize){
        super(datas,comparator,heapSize);
    }
    @Override
    public void sort() {
        buildHeap();
        for (int i=heapSize;i>=1;i--){
            exchange(0,i);
            heapify(0,i-1);
        }
    }
}

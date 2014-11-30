package IntroAlgo.DataStru.HeapOld;

import java.util.Comparator;

/**
 * Created by adam on 14-9-17.
 */
public class BaseHeap implements IHeap{
    @Override
    public void buildHeap(Object[] datas, Comparator comparator) {
        int heapSize = datas.length-1;

        for (int i = heapSize/2; i >=0 ; i--)
            heapify(datas,i,heapSize,comparator);
    }

    @Override
    public void heapify(Object[] datas, int iStart, int heapSize, Comparator comparator) {
//        int l = iStart*2+1, r = (iStart+1)*2;
        int l = leftChild(iStart), r = rightChild(iStart);
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

    @Override
    public   void exchangeObject(Object[] datas,int first,int second){
        Object temp = datas[first];
        datas[first] = datas[second];
        datas[second] = temp;
    }

    @Override
    public int leftChild(int parent) {
        return parent*2+1;
    }

    @Override
    public int rightChild(int parent) {
        return (parent+1)*2;
    }

    @Override
    public int parent(int child) {
        return child/2;
    }


}

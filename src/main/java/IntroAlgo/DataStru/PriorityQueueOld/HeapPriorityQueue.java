package IntroAlgo.DataStru.PriorityQueueOld;

import IntroAlgo.DataStru.HeapOld.BaseHeap;
import IntroAlgo.DataStru.HeapOld.IHeap;

import java.util.Comparator;

/**
 * Created by adam on 14-9-17.
 */
public class HeapPriorityQueue implements IPriorityQueue,IQueueLife {
    private IHeap heaper;

    public HeapPriorityQueue(){
        heaper = new BaseHeap();
    }

    public HeapPriorityQueue(IHeap heaper){
        this.heaper = heaper;
    }

    @Override
    public void insert(Object[] datas, Object x, int heapSize, Comparator comparator) {
        assert datas.length>=1;
        assert heapSize<=datas.length-1;

        increaseKey(datas,heapSize+1,x,comparator);
    }

    @Override
    public Object maximumOrMinxi(Object[] datas) {
        return datas[0];
    }

    @Override
    public Object extractMaxOrMin(Object[] datas, Comparator comparator) {
        assert datas.length >=1;

        Object top = maximumOrMinxi(datas);
        int heapSize = datas.length;

        heaper.exchangeObject(datas,0,heapSize-1);
        datas[heapSize-1] = null;
        heaper.heapify(datas,0,heapSize-1,comparator);
        return top;

    }

    @Override
    public void increaseKey(Object[] datas, int index, Object k, Comparator comparator) {
        assert comparator.compare(datas[index],k)<0;

        datas[index] = k;
        while(index>=0 && comparator.compare(datas[heaper.parent(index)],k)<0){
            heaper.exchangeObject(datas,heaper.parent(index),index);
            index = heaper.parent(index);
        }

    }

    @Override
    public void initQueue(Object[] datas, Comparator comparator) {
        heaper.buildHeap(datas,comparator);
    }
}

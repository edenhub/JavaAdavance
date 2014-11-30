package IntroAlgo.DataStru.PriorityQueue;

import java.util.Comparator;

/**
 * Created by adam on 14-9-17.
 */
public class HeapPriorityQueue implements IPriorityQueue,IQueueLife{
    protected IHeap heaper;
    protected Object[] datas;
    protected Comparator comparator;
    protected int heapSize;

    public HeapPriorityQueue(Object[] datas,Comparator comparator,int heapSize){
        this.datas = datas;
        this.comparator = comparator;
        this.heapSize = heapSize;
        heaper = new BaseHeap(datas,comparator,heapSize);
    }

    @Override
    public void insert(Object x) {
        assert heapSize <= datas.length-1;
        increaseKey(heapSize+1,x);
    }

    @Override
    public Object maximumOrMinxi() {
        return datas[0];
    }

    @Override
    public Object extractMaxOrMin() {
        assert heapSize >0;

        Object top = maximumOrMinxi();
        heaper.exchange(0,heapSize);
        datas[heapSize--] = null;
        heaper.heapify(0,heapSize);

        return top;
    }

    @Override
    public void increaseKey(int index, Object k) {
        if (datas[index]!=null)
            assert comparator.compare(datas[index],k) < 0;

        datas[index] = k;
        while (index >=0 && comparator.compare(datas[heaper.parent(index)],k)<0){
            heaper.exchange(heaper.parent(index),index);
            index = heaper.parent(index);
        }
    }

    @Override
    public void initQueue() {
        heaper.buildHeap();
    }
}

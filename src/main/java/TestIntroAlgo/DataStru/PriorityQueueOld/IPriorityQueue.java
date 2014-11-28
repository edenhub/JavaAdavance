package TestIntroAlgo.DataStru.PriorityQueueOld;

import java.util.Comparator;

/**
 * Created by adam on 14-9-17.
 */
public interface IPriorityQueue {

    public void insert(Object[] datas,Object x,int heapSize,Comparator comparator);
    public Object maximumOrMinxi(Object[] datas);
    public Object extractMaxOrMin(Object[] datas,Comparator comparator);
    public void increaseKey(Object[] datas,int index,Object k,Comparator comparator);
}

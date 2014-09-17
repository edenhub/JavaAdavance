package IntroAlgo.DataStru.PriorityQueue;

import java.util.Comparator;

/**
 * Created by adam on 14-9-17.
 */
public interface IPriorityQueue {
    public void insert(Object x);
    public Object maximumOrMinxi();
    public Object extractMaxOrMin();
    public void increaseKey(int index,Object k);
}

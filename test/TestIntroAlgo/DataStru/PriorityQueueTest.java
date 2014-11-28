package TestIntroAlgo.DataStru;

import TestIntroAlgo.ComparatorImple.NumberComparator;
import TestIntroAlgo.DataStru.PriorityQueue.HeapPriorityQueue;
import TestIntroAlgo.Sort.Util.Dumper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by adam on 14-9-17.
 */
public class PriorityQueueTest {

    public static Object[] datas = new Object[7];
    public static NumberComparator comparator = new NumberComparator(false);

    @Before
    public void before(){
        datas[0] = 3;
        datas[1] = 33;
        datas[2] = 11;
        datas[3] = 4;
        datas[4] = 5;
        datas[5] = 99;
    }

    @After
    public void after(){
        Dumper.dumpArray(datas);
    }

    @Test
    public void test01(){
        HeapPriorityQueue priorityQueue = new HeapPriorityQueue(datas,comparator,5);
        priorityQueue.initQueue();
        after();

        System.out.println(priorityQueue.maximumOrMinxi());
        priorityQueue.extractMaxOrMin();

        priorityQueue.increaseKey(0,100);
        after();

        priorityQueue.insert(400);
        after();
        priorityQueue.insert(33);
//        after();
//        priorityQueue.insert(1);
    }
}

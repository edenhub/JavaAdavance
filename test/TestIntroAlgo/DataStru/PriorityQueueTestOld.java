package TestIntroAlgo.DataStru;

import TestIntroAlgo.ComparatorImple.NumberComparator;
import TestIntroAlgo.DataStru.PriorityQueueOld.HeapPriorityQueue;
import TestIntroAlgo.Sort.Util.Dumper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by adam on 14-9-17.
 */
public class PriorityQueueTestOld {
    public static Integer[] datas = new Integer[6];
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
        defaultAfterMethod();
    }

    public void defaultAfterMethod(){
        Dumper.dumpArray(datas);

    }

    @Test
    public void test01(){
        HeapPriorityQueue priorityQueue = new HeapPriorityQueue();
        comparator.setNegative(true);
        priorityQueue.initQueue(datas,comparator);
        System.out.println(priorityQueue.maximumOrMinxi(datas));
        priorityQueue.extractMaxOrMin(datas,comparator);
        priorityQueue.increaseKey(datas,3,4,comparator);
//        priorityQueue.insert(datas,8,4,comparator);

    }

}

package IntroAlgo.DataStru;

import IntroAlgo.ComparatorImple.NumberComparator;
import IntroAlgo.DataStru.Heap.BaseHeap;
import IntroAlgo.DataStru.Heap.BaseHeapSort;
import IntroAlgo.DataStru.Heap.IHeap;
import IntroAlgo.Sort.Util.Dumper;
import org.junit.After;
import org.junit.Test;

import java.util.Comparator;

/**
 * Created by adam on 14-9-17.
 */
public class TestBaseHeap {

    public static Object[] datas = {3,33,11,4,5,99};
    public static Comparator comparator = new NumberComparator(false);

    @Test
    public void testHeap(){
        IHeap heaper = new BaseHeap(datas,comparator,datas.length-1);
        heaper.buildHeap();
    }

    @Test
    public void testHeapSort(){

        BaseHeapSort heapSort = new BaseHeapSort(datas,comparator,datas.length-1);
        heapSort.sort();
    }

    @Test
    public void testSort(){
        IHeap heaper = new BaseHeap(datas,comparator,datas.length-1);
        heaper.buildHeap();

        for (int i=heaper.getHeapSize(); i>=1; i--){
            heaper.exchange(0,i);

            heaper.heapify(0,i-1);
        }
    }

    @After
    public void after(){
        Dumper.dumpArray(datas);
    }
}

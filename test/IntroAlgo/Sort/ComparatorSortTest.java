package IntroAlgo.Sort;

import IntroAlgo.ComparatorImple.NumberComparator;
import IntroAlgo.Sort.AbsSorter.ComparableSorter;
import IntroAlgo.Sort.Exception.TypeNotFoundException;
import IntroAlgo.Util.Dumper;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Test;

import java.util.Comparator;
import java.util.Random;

/**
 * Created by lab on 14-8-10.
 */
public class ComparatorSortTest {

    public static Integer[] datas = {3,33,11,4,5,99};
    public static ComparableSorter sorter;

    @After
    public void after(){
        defaultAfterMethod();
    }

    public void defaultAfterMethod(){
        sorter.sort(datas);
        Dumper.dumpArray(datas);
    }

    public void setDefaultComparator(){

        sorter.setComparator(new NumberComparator(false));
    }


    @Test
    public void InsertSortTest() throws TypeNotFoundException {
        sorter = (ComparableSorter) SortManager.createSorter(SortType.InsertSort);
        setDefaultComparator();
    }

    @Test
    public void MergeSortTest() throws TypeNotFoundException {
        sorter = (ComparableSorter) SortManager.createSorter(SortType.MergeSort);
        setDefaultComparator();
    }

    @Test
    public void HeapSortTest() throws TypeNotFoundException {
        sorter = (ComparableSorter) SortManager.createSorter(SortType.HeapSort);
        setDefaultComparator();
    }

    @Test
    public void MinHeapSortTest() throws TypeNotFoundException {
        sorter = (ComparableSorter) SortManager.createSorter(SortType.HeapSort);
        sorter.setComparator(new NumberComparator(true));
    }

}

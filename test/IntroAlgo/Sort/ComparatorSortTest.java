package IntroAlgo.Sort;

import IntroAlgo.ComparatorImple.NumberComparator;
import IntroAlgo.Sort.AbsSorter.ComparableSorter;
import IntroAlgo.Sort.SortManager.PropertiesSortManager;
import IntroAlgo.Sort.SortManager.SortType;
import IntroAlgo.Sort.SortManager.TypeSortManager;
import IntroAlgo.Sort.Util.Dumper;
import org.junit.After;
import org.junit.Test;

/**
 * Created by lab on 14-8-10.
 */

public class ComparatorSortTest {
    public static Integer[] datas = {3,33,11,4,5,99};
    public static ComparableSorter sorter;
    public static TypeSortManager typeSortManager = new TypeSortManager();
    public static PropertiesSortManager propertiesSortManager = PropertiesSortManager.getInstance();

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
    public void InsertSortTest() throws Exception {
        sorter = (ComparableSorter) typeSortManager.createSorter(SortType.InsertSort);
        setDefaultComparator();
    }

    @Test
    public void MergeSortTest() throws Exception {
        sorter = (ComparableSorter) typeSortManager.createSorter(SortType.MergeSort);
        setDefaultComparator();
    }

    @Test
    public void HeapSortTest() throws Exception {
        sorter = (ComparableSorter) typeSortManager.createSorter(SortType.HeapSort);
        setDefaultComparator();
    }

    @Test
    public void MinHeapSortTest() throws Exception {
        sorter = (ComparableSorter) typeSortManager.createSorter(SortType.HeapSort);
        sorter.setComparator(new NumberComparator(true));
    }

    @Test
    public void QuickSortTest() throws Exception {
        sorter = (ComparableSorter) typeSortManager.createSorter(SortType.QuickSort);
        setDefaultComparator();
    }

    @Test
    public void MinQuickSortTest() throws Exception {
        sorter = (ComparableSorter) typeSortManager.createSorter(SortType.QuickSort);
        sorter.setComparator(new NumberComparator(true));
    }

    @Test
    public void PropertiesSortTest() throws Exception {
        PropertiesSortManager manager = PropertiesSortManager.getInstance();
        sorter = (ComparableSorter) manager.createSorter("sorter.insertSort");
        setDefaultComparator();
    }

    @Test
    public void TestRadomQuickSort() throws Exception {
        sorter = (ComparableSorter) propertiesSortManager.createSorter("sorter.randomQuickSort");
        setDefaultComparator();
    }
//    @Test
//    public void testPropertiesType(){
//       PropertiesSortManager manager = PropertiesSortManager.getInstance();
//       manager.checkType();
//    }

}

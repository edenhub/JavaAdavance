package IntroAlgo.Sort;

import IntroAlgo.Sort.AbsSorter.LifeSorter;
import IntroAlgo.Sort.Exception.TypeNotFoundException;
import IntroAlgo.Util.Dumper;
import org.junit.Test;

/**
 * Created by lab on 14-8-12.
 */
public class LifeSortTest {

    public static Integer[] datas = {3,33,11,4,5,99};
    public static LifeSorter sorter;

    @Test
    public void RandomInPlace() throws TypeNotFoundException {
        sorter = (LifeSorter) SortManager.createSorter(SortType.RandomInPlace);
        sorter.sort(datas);
        Dumper.dumpArray(datas);
    }
}

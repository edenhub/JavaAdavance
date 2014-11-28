package TestIntroAlgo.Sort.SortManager;

import TestIntroAlgo.Sort.Sorter;

/**
 * Created by adam on 14-9-17.
 */
public interface ISortManager {

    public Sorter createSorter(String sorterName) throws Exception;
    public Sorter createSorter(SortType sortType) throws Exception;
    public void checkType();
}

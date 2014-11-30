package TestInroAlgo.ch02;

import IntroAlgo.ComparatorImple.NumberComparator;
import IntroAlgo.Sort.Util.Dumper;
import org.junit.Assert;

/**
 * Created by lab on 14-8-4.
 */
public class Test {

    @org.junit.Test
    public void test01(){
        Integer a = new Integer(2);

        System.out.println(a.getClass().getSimpleName());
    }

    @org.junit.Test
    public void numberComparator(){
        Integer i1 = 4;
        Integer i2 = 3;

        Assert.assertTrue((new NumberComparator(false).compare(i1,i2))>0);
    }

    @org.junit.Test
    public void insertSortTest(){
        Integer[] datas = {5,2,1,6};

//        InsertSort.sort(datas, new NumberComparator(true));
        Dumper.dumpArray(datas);

    }

    @org.junit.Test
    public void mergeSortTest(){
        Integer[] datas = {5,2,1,6,3};

//        MergeSort.sort(datas,0,datas.length-1,new NumberComparator(false));

        Dumper.dumpArray(datas);
    }


}

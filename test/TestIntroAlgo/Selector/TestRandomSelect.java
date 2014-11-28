package TestIntroAlgo.Selector;

import TestIntroAlgo.ComparatorImple.NumberComparator;
import TestIntroAlgo.Select.AbsCmpTipSelecter;
import TestIntroAlgo.Select.TipSelectImple.RandomTipSelecter;
import org.junit.Test;

import java.util.Comparator;

/**
 * Created by adam on 14-9-18.
 */
public class TestRandomSelect {
    public static Object[] datas = {2,33,199,29,20,1,222};
    public static Comparator comparator = new NumberComparator(false);

    @Test
    public void test01(){
        AbsCmpTipSelecter compSelecter = new RandomTipSelecter();
        compSelecter.setDatas(datas);
        compSelecter.setComparator(comparator);

        System.out.println(compSelecter.selectTip(datas.length));
    }
}

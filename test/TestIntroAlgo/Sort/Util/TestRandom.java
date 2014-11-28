package TestIntroAlgo.Sort.Util;

import org.junit.Test;

/**
 * Created by adam on 14-9-18.
 */
public class TestRandom {

    @Test
    public void test01(){
        int begin = 3,end = 9;

        for (int i=0;i<100;i++){
            int random = RandomUtil.randomInRange(begin,end);
            assert random >= begin;
            assert random <= end;
        }
    }
}

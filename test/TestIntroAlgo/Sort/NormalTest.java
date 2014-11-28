package TestIntroAlgo.Sort;

import TestIntroAlgo.Sort.Util.Dumper;
import org.junit.Test;

import java.util.Random;

/**
 * Created by lab on 14-8-12.
 */
public class NormalTest {

    @Test
    public void testRandomNum(){
        Random random = new Random();
        int length = 10;

        for(int i=0;i<length;i++){
            int dest = Math.round(random.nextFloat()*(length-i)+i);

            Dumper.dumpObject(dest);
        }

    }

    @Test
    public void testRandom(){
        Random random = new Random();

    }
}

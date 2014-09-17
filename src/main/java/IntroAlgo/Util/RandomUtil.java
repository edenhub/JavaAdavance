package IntroAlgo.Util;

import java.util.Random;

/**
 * Created by adam on 14-9-18.
 */
public class RandomUtil {

    private static Random random = new Random();

    public static int randomInRange(int begin,int end){
        assert begin < end;

        int bound = end-begin+1;
        return random.nextInt(bound) + begin;
    }
}

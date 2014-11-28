package TestIntroAlgo.Sort.Util;

/**
 * Created by adam on 14-9-18.
 */
public class ExchangeUtil {

    public static void exchange(Object[] datas,int first,int second){
        Object temp = datas[first];
        datas[first] = datas[second];
        datas[second] = temp;
    }
}

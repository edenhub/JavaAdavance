package TestIntroAlgo.Sort.LinerSortImple;

import TestIntroAlgo.Sort.AbsSorter.LifeSorter;

import java.util.Comparator;
import java.util.Random;

/**
 * Created by lab on 14-8-12.
 */
public class RandInPlace extends LifeSorter {
    private Random random;

    public RandInPlace(){
        super();
        random = new Random();
    }

    public RandInPlace(long seed){
        super();
        random = new Random(seed);
    }

    @Override
    protected void invoke(Object[] datas, Comparator comparator) {
        int length = datas.length;

        for (int i=0;i<length;i++){
            int dest = random.nextInt(length-i)+i;
            exchangeObject(datas,i,dest);
        }
    }

    protected void exchangeObject(Object[] datas,int src,int dest){
        Object tmp = datas[src];
        datas[src] = datas[dest];
        datas[dest] = tmp;
    }
}

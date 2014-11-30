package IntroAlgo.Sort.ComparableSortImple;

import IntroAlgo.Sort.Util.RandomUtil;

import java.util.Comparator;

/**
 * Created by adam on 14-9-18.
 */
public class RandomQuickSorter extends QuickSorter{

    public int randomPartitoin(Object[] datas,int p,int r,Comparator comparator){
        int i = RandomUtil.randomInRange(p, r);
        exchange(datas,i,r);

        return partition(datas,p,r,comparator);
    }



    @Override
    public void quickSort(Object[] datas, int p, int r, Comparator comparator) {
        if (p<r){
            int q = randomPartitoin(datas,p,r,comparator);
            quickSort(datas,p,q-1,comparator);
            quickSort(datas,q+1,r,comparator);
        }
    }
}

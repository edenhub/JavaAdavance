package IntroAlgo.Select.TipSelectImple;

import IntroAlgo.Select.AbsCmpTipSelecter;
import IntroAlgo.Sort.ComparableSortImple.RandomQuickSorter;

import java.util.Comparator;

/**
 * Created by adam on 14-9-18.
 */
public class RandomTipSelecter extends AbsCmpTipSelecter {
    private RandomQuickSorter quickSorter;

    public RandomTipSelecter(){
        super();
        quickSorter = new RandomQuickSorter();
    }

    public RandomTipSelecter(int length, Comparator comparator){
        super(length,comparator);
        quickSorter = new RandomQuickSorter();
    }

    public RandomTipSelecter(Object[] datas, Comparator comparator) {
        super(datas,comparator);
        quickSorter = new RandomQuickSorter();
    }

    @Override
    public Object selectTip(int index) {
        return randomSelect(datas,0,datas.length-1,index);
    }

    @Override
    public Object selectTip() {
        return selectTip(1);
    }

    protected Object randomSelect(Object[] datas,int p,int r,int index){
        if (p == r)
            return datas[p];

        int q = quickSorter.randomPartitoin(datas,p,r,comparator);
        int k = q-p+1;

        if (index == k)
            return datas[q];
        else if (index < k)
            return randomSelect(datas,p,q-1,index);
        else
            return randomSelect(datas,q+1,r,index-k);
    }
}

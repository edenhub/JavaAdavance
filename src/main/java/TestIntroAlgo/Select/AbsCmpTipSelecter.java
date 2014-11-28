package TestIntroAlgo.Select;

import java.util.Comparator;

/**
 * Created by adam on 14-9-18.
 */
public abstract class AbsCmpTipSelecter implements TipSelecter {
    protected Object[] datas;
    protected Comparator comparator;

    public AbsCmpTipSelecter(){}

    public AbsCmpTipSelecter(int length, Comparator comparator){
        datas = new Object[length];
        this.comparator = comparator;
    }

    public AbsCmpTipSelecter(Object[] datas, Comparator comparator){
        this.datas = datas;
        this.comparator = comparator;
    }

    public Object[] getDatas() {
        return datas;
    }

    public void setDatas(Object[] datas) {
        this.datas = datas;
    }

    public Comparator getComparator() {
        return comparator;
    }

    public void setComparator(Comparator comparator) {
        this.comparator = comparator;
    }
}

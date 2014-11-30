package IntroAlgo.Sort.AbsSorter;

import IntroAlgo.Sort.SortLife;

import java.util.Comparator;

/**
 * Created by lab on 14-8-10.
 */
public abstract class ComparableSorter extends LifeSorter{
    protected Comparator comparator;

    public ComparableSorter(){
        super();
    }

    public ComparableSorter(SortLife sortLife, Comparator comparator){
        this.sortLife = sortLife;
        this.comparator = comparator;
    }

    public Comparator getComparator() {
        return comparator;
    }

    public void setComparator(Comparator comparator) {
        this.comparator = comparator;
    }

    @Override
    public void sort(Object[] datas) {
        assert datas!= null;
        assert comparator != null;
        sortLife.before(datas, comparator);
        invoke(datas,comparator);
        sortLife.after(datas);
    }
}

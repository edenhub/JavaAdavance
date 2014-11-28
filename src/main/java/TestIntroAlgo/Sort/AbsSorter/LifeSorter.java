package TestIntroAlgo.Sort.AbsSorter;

import TestIntroAlgo.Sort.LifeImple.AbstractLife;
import TestIntroAlgo.Sort.SortLife;
import TestIntroAlgo.Sort.Sorter;

import java.util.Comparator;

/**
 * Created by lab on 14-8-12.
 */
public abstract class LifeSorter implements Sorter{
    protected SortLife sortLife;

    public LifeSorter(){
        sortLife = new AbstractLife();
    }

    @Override
    public void sort(Object[] datas) {
        assert datas!= null;
        sortLife.before(datas, null);
        invoke(datas,null);
        sortLife.after(datas);
    }

    abstract protected void invoke(Object[] datas,Comparator comparator);

    public SortLife getSortLife() {
        return sortLife;
    }

    public void setSortLife(SortLife sortLife) {
        this.sortLife = sortLife;
    }
}

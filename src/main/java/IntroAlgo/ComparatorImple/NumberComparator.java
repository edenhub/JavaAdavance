package IntroAlgo.ComparatorImple;

import java.util.Comparator;

/**
 * Created by lab on 14-8-4.
 */
public class NumberComparator implements Comparator{
    public boolean negative;

    public NumberComparator(boolean negative){
        this.negative = negative;
    }

    @Override
    public int compare(Object o1, Object o2) {
        assert o1 instanceof Number;
        assert o2 instanceof Number;
        Comparable c1 = (Comparable)o1;
        if (!this.negative)
            return c1.compareTo(o2);
        else
            return -(c1.compareTo(o2));
    }
}

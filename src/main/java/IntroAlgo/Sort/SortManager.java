package IntroAlgo.Sort;

import IntroAlgo.Sort.Exception.TypeNotFoundException;
import IntroAlgo.Sort.SortImple.InsertSorter;
import IntroAlgo.Sort.SortImple.MergeSorter;
import IntroAlgo.Sort.SortImple.RandInPlace;

import java.util.Objects;

/**
 * Created by lab on 14-8-10.
 */
public class SortManager {

    public static Sorter createSorter(SortType type) throws TypeNotFoundException {
        Sorter sorter = null;
        switch (type){
            case InsertSort:
                sorter = new InsertSorter(); break;

            case MergeSort:
                sorter = new MergeSorter(); break;

            case RandomInPlace:
                sorter = new RandInPlace(); break;

            default:{
                throw new TypeNotFoundException("没有这个排序类型，请检查是否输入正确，或者使用checkType()查看可用类型");
            }
        }

        Objects.nonNull(sorter);
        return sorter;
    }

    public static void checkType(){
        System.out.print("[ ");
        for(SortType st : SortType.values())
            System.out.print(st + " ");
        System.out.println("]");
    }

}

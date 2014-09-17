package IntroAlgo.Sort.SortManager;

import IntroAlgo.Sort.Exception.MethodNotUseException;
import IntroAlgo.Sort.Exception.TypeNotFoundException;
import IntroAlgo.Sort.SortImple.*;
import IntroAlgo.Sort.Sorter;

import java.util.Objects;

/**
 * Created by lab on 14-8-10.
 */
public class TypeSortManager implements ISortManager{

    @Override
    public Sorter createSorter(String sorterName) throws Exception {
        throw new MethodNotUseException("该方法不可用，请用createSorter(SortType type);");
    }

    @Override
    public  Sorter createSorter(SortType type) throws Exception {
        Sorter sorter = null;
        switch (type){
            case InsertSort:
                sorter = new InsertSorter(); break;

            case MergeSort:
                sorter = new MergeSorter(); break;

            case RandomInPlace:
                sorter = new RandInPlace(); break;

            case HeapSort:
                sorter = new HeapSorter(); break;

            case QuickSort:
                sorter = new QuickSorter(); break;

            case RandomQuickSort:
                sorter = new RandomQuickSorter(); break;

            default:{
                throw new TypeNotFoundException("没有这个排序类型，请检查是否输入正确，或者使用checkType()查看可用类型");
            }
        }

        Objects.nonNull(sorter);
        return sorter;
    }

    @Override
    public void checkType(){
        System.out.print("[ ");
        for(SortType st : SortType.values())
            System.out.print(st + " ");
        System.out.println("]");
    }

}

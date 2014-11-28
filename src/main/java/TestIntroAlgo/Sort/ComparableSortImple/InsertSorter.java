package TestIntroAlgo.Sort.ComparableSortImple;

import TestIntroAlgo.Sort.AbsSorter.ComparableSorter;

import java.util.Comparator;

/**
 * Created by lab on 14-8-10.
 */
public class InsertSorter extends ComparableSorter {
    protected void invoke(Object[] datas,Comparator comparator){
        int lenght = datas.length;
        int i;
        Object key = null;

        for(int j=1;j<lenght;j++){
            i = j-1;
            key = datas[j];

            while(i>=0 && (comparator.compare(key,datas[i])<0)){
                datas[i+1] = datas[i];
                i--;
            }
            datas[i+1] = key;
        }
    }
}

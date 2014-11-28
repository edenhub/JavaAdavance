package TestIntroAlgo.DataStru.HeapOld;

import java.util.Comparator;

/**
 * Created by adam on 14-9-17.
 */
public interface IHeap {
    public void buildHeap(Object[] datas,Comparator comparator);
    public void heapify(Object[] datas,int iStart,int heapSize,Comparator comparator);
    public void exchangeObject(Object[] datas,int first,int second);
    public int leftChild(int parent);
    public int rightChild(int parent);
    public int parent(int child);
}

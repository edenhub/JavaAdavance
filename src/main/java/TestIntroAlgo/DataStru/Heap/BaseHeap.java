package TestIntroAlgo.DataStru.Heap;

import java.util.Comparator;
import java.util.Objects;

/**
 * Created by adam on 14-9-17.
 */
public class BaseHeap implements IHeap{
    protected Object[] datas;
    protected Comparator comparator;
    protected int heapSize;

    public BaseHeap(){}

    public BaseHeap(Object[] datas,Comparator comparator,int heapSize){
        this.datas = datas;
        this.comparator = comparator;
        this.heapSize = heapSize;
    }

    private void varify(){
        Objects.nonNull(datas);
        Objects.nonNull(comparator);
        assert heapSize <= datas.length;
    }

    @Override
    public void buildHeap() {
        varify();
        for (int i=heapSize/2; i>=0; i--){
            heapify(i,heapSize);
        }
    }

    @Override
    public void heapify(int iStart,int heapSize) {
        int l = leftChild(iStart), r = rightChild(iStart);
        int largest;

        if (l <= heapSize && comparator.compare(datas[l],datas[iStart])>0)
            largest = l;
        else
            largest = iStart;

        if (r <= heapSize && comparator.compare(datas[r],datas[largest])>0)
            largest = r;

        if (largest != iStart){
            exchange(iStart,largest);
            heapify(largest,heapSize);
        }
    }

    @Override
    public void exchange(int first, int second) {
        Object temp = datas[first];
        datas[first] = datas[second];
        datas[second] = temp;
    }

    @Override
    public int leftChild(int parent) {
        return parent*2+1;
    }

    @Override
    public int rightChild(int parent) {
        return (parent+1)*2;
    }

    @Override
    public int parent(int child) {
        return child/2;
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

    @Override
    public int getHeapSize() {
        return heapSize;
    }

    public void setHeapSize(int heapSize) {
        this.heapSize = heapSize;
    }
}

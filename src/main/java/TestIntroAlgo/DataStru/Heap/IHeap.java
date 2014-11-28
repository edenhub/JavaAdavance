package TestIntroAlgo.DataStru.Heap;

/**
 * Created by adam on 14-9-17.
 */
public interface IHeap {
    public void buildHeap();
    public void heapify(int iStart,int heapSize);
    public void exchange(int first,int second);

    public int leftChild(int parent);
    public int rightChild(int parent);
    public int parent(int child);

    public int getHeapSize();
}

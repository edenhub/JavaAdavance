package IntroAlgo.DataStru.Tree.BinSearchTree;

/**
 * Created by adam on 14-10-9.
 */
public class Node implements INode{
    private Object key;
    private Node parent,leftChild,rightChild;

    public void setKey(Object key) {
        this.key = key;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public Node parent() {
        return this.parent;
    }

    @Override
    public Node leftChild() {
        return this.leftChild;
    }

    @Override
    public Node rightChild() {
        return this.rightChild;
    }

    @Override
    public Object key() {
        return this.key;
    }
}

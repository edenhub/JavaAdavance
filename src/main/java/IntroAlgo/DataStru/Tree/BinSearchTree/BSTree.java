package IntroAlgo.DataStru.Tree.BinSearchTree;

import IntroAlgo.DataStru.Tree.Dumper.IDumper;

import java.util.Comparator;

/**
 * Created by adam on 14-10-10.
 */
public abstract class BSTree implements IBSTree {
    private Node root;

    protected Comparator comparator;

    public BSTree(){}

    public BSTree(Node root,Comparator comparator){
        this.root = root;
    }

    @Override
    public void addNode(Node node) {
        treeInsert(root,node);
    }

    @Override
    public Node deleteNode(Node node) {
        Node x = null, y = null;
        if (node.leftChild()==null || node.rightChild()==null)
            y = node;
        else
            y = successor(node);

        if (y.leftChild() != null)
            x = y.leftChild();
        else
            x = y.rightChild();

        if (x != null)
            x.setParent(y.parent());

        if (y.parent() == null){
            root = x;
        }else if (comparator.compare(y.key(),y.parent().leftChild().key())==0){
            y.parent().setLeftChild(x);
        }else{
            y.parent().setRightChild(x);
        }

        if (comparator.compare(y.key(),node.key())!=0){
            node.setKey(y.key());
        }

        return y;
    }

    protected abstract void treeInsert(Node tree,Node newNode);

    @Override
    public Node predecessor(Node node) {
        if (node.leftChild() != null)
            return treeMaximum(node);

        Node parent = node.parent();
        Node copy = node;

        while(parent!= null && copy == parent.leftChild()){
            copy = parent;
            parent = copy.parent();
        }

        return parent;
    }

    @Override
    public Node successor(Node node) {
        if (node.rightChild() != null)
            return treeMinimum(node);
        Node parent = node.parent();
        Node copy = node;

        while(parent!=null && copy == parent.rightChild()){
            copy = parent;
            parent = copy.parent();
        }

        return parent;
    }

    @Override
    public void sort(IDumper dumper) {
        inOrderTreeView(root,dumper);
    }

    @Override
    public Node search(Object k) {
        return treeSearch(root,k);
    }

    @Override
    public Node minimum() {
        return treeMinimum(root);
    }

    @Override
    public Node maximum() {
        return treeMaximum(root);
    }

    protected abstract Node treeMinimum(Node node);

    protected abstract Node treeMaximum(Node node);

    protected abstract void inOrderTreeView(Node node,IDumper dumper);

    protected abstract Node treeSearch(Node node,Object k);

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Comparator getComparator() {
        return comparator;
    }

    public void setComparator(Comparator comparator) {
        this.comparator = comparator;
    }
}

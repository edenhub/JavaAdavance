package IntroAlgo.DataStru.Tree.BinSearchTree;

import IntroAlgo.DataStru.Tree.IDumper;

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
    public boolean addNode(Node node) {
        return false;
    }

    @Override
    public boolean deleteNode(Node node) {
        return false;
    }

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

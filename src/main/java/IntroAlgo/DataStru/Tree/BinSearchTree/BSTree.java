package IntroAlgo.DataStru.Tree.BinSearchTree;

import IntroAlgo.DataStru.Tree.IDumper;

import java.util.Comparator;

/**
 * Created by adam on 14-10-10.
 */
public class BSTree implements IBSTree {
    private Node root;
    private Comparator comparator;

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
    public void sort(IDumper dumper) {
        inOrderTreeView(root,dumper);
    }

    @Override
    public Node search(Object k) {
        return treeSearch(root,k);
    }

    protected void inOrderTreeView(Node node,IDumper dumper){
        if (node != null){
            inOrderTreeView(node.leftChild(),dumper);
            dumper.dumperObject(node.key());
            inOrderTreeView(node.rightChild(),dumper);
        }
    }

    protected Node treeSearch(Node node,Object k){
        if (comparator.compare(node.key(),k) == 0)
            return node;
        else if (comparator.compare(node.key(),k) < 0)
            return treeSearch(node.leftChild(),k);
        else
            return treeSearch(node.rightChild(),k);
    }

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

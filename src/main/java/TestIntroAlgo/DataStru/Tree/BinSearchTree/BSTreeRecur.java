package TestIntroAlgo.DataStru.Tree.BinSearchTree;

import TestIntroAlgo.DataStru.Tree.Dumper.IDumper;

/**
 * Created by adam on 14-10-10.
 */
public class BSTreeRecur extends BSTree {

    @Override
    protected void treeInsert(Node tree, Node newNode) {
        if (tree == null){
            tree = newNode;
        }else if (comparator.compare(newNode.key(),tree.key())<0)
            treeInsert(tree.leftChild(),newNode);
        else
            treeInsert(tree.rightChild(),newNode);
    }

    @Override
    protected Node treeMinimum(Node node) {
        if (node.leftChild() == null)
            return node;
        else
            return treeMinimum(node.leftChild());
    }

    @Override
    protected Node treeMaximum(Node node) {
        if (node.rightChild() == null)
            return node;
        else
            return treeMaximum(node.rightChild());
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

}

package TestIntroAlgo.DataStru.Tree.BinSearchTree;

import TestIntroAlgo.DataStru.Tree.Dumper.IDumper;

import java.util.Stack;

/**
 * Created by adam on 14-10-10.
 */
public class BSTreeNoRecur extends BSTree {
    @Override
    protected void treeInsert(Node tree, Node newNode) {
        Node y = null;
        Node copy = tree;

        while(copy != null){
            y = copy;
            if (comparator.compare(newNode.key(),copy.key())<0)
                copy = copy.leftChild();
            else
                copy = copy.rightChild();
        }

        newNode.setParent(y);
        if (y == null){
            tree = newNode;
        }else{
            if (comparator.compare(newNode.key(),y.key())<0)
                y.setLeftChild(newNode);
            else
                y.setRightChild(newNode);
        }
    }

    @Override
    protected Node treeMinimum(Node node) {
        Node target = node;

        while(target.leftChild() != null)
            target = target.leftChild();

        return target;
    }

    @Override
    protected Node treeMaximum(Node node) {
        Node target = node;

        while(target.rightChild() != null)
            target = target.rightChild();

        return target;
    }

    @Override
    protected void inOrderTreeView(Node node, IDumper dumper) {
        Stack<Node> stack = new Stack<Node>();
        Node target = node;

        while(target != null || !stack.empty()){
            while(node!=null){
                stack.push(target);
                target = target.rightChild();
            }

            if (!stack.empty()){
                target = stack.pop();
                dumper.dumperObject(target.key());
                target = target.leftChild();
            }
        }
    }

    @Override
    protected Node treeSearch(Node node, Object k) {
        Node target = node;
        while(target != null && ( comparator.compare(target.key(),k)!= 0 ) ){
            if (comparator.compare(target.key(),k) <0 )
                target = target.leftChild();
            else
                target = target.rightChild();
        }

        return target;
    }
}

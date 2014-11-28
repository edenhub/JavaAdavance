package TestIntroAlgo.DataStru.Tree.BinSearchTree;

import java.util.List;

/**
 * Created by adam on 14-10-10.
 */
public class BSTBuilder implements IBSTBuilder {
    @Override
    public BSTree buildFromList(Node[] list, boolean isRecur) {
        assert list.length != 0;
        BSTree bsTree;
        if (isRecur)
            bsTree = new BSTreeRecur();
        else
            bsTree = new BSTreeNoRecur();

        for (Node node : list)
            bsTree.addNode(node);

        return bsTree;
    }

    @Override
    public BSTree buildFromList(List<Node> list, boolean isRecur) {
        assert !list.isEmpty();
        BSTree bsTree;
        if (isRecur)
            bsTree = new BSTreeRecur();
        else
            bsTree = new BSTreeNoRecur();

        for (Node node : list)
            bsTree.addNode(node);

        return bsTree;
    }
}

package IntroAlgo.DataStru.Tree.BinSearchTree;

import java.util.List;

/**
 * Created by adam on 14-10-10.
 */
public interface IBSTBuilder {

    public BSTree buildFromList(Node[] list,boolean isRecur);
    public BSTree buildFromList(List<Node> list,boolean isRecur);
}

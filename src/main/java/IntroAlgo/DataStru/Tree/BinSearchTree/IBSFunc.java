package IntroAlgo.DataStru.Tree.BinSearchTree;

import IntroAlgo.DataStru.Tree.IDumper;

/**
 * Created by adam on 14-10-10.
 */
public interface IBSFunc {
    public void sort(IDumper dumper);
    public Node search(Object k);

    public Node minimum();
    public Node maximum();

    public Node successor(Node node);
    public Node predecessor(Node node);
}

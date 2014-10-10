package IntroAlgo.DataStru.Tree.Dumper;

import IntroAlgo.DataStru.Tree.IDumper;

/**
 * Created by adam on 14-10-10.
 */
public class ConsoleBSTDumper implements IDumper {
    @Override
    public void dumperObject(Object o) {
        System.out.println(o);
    }
}

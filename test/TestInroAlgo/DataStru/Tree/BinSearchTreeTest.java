package TestInroAlgo.DataStru.Tree;

import org.junit.Test;

import java.io.Console;
import java.io.PrintWriter;

/**
 * Created by adam on 14-10-9.
 */
public class BinSearchTreeTest {

    @Test
    public void testConsole(){
        Console console = System.console();
        if (console!= null){
            PrintWriter writer = console.writer();
            writer.write("hell world");
            console.flush();
        }
    }
}

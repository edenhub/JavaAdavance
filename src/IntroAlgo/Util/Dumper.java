package IntroAlgo.Util;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Created by lab on 14-8-10.
 */
public class Dumper {

    public static void dumpArray(Object[] datas,PrintWriter writer){
        writer.print("[ ");
        for (int i=0;i<datas.length;i++)
            writer.print(datas[i]+" ");
        writer.print("]"+"\n");
        writer.flush();
    }

    public static void dumpArray(Object[] datas){
        dumpArray(datas,new PrintWriter(System.out,true));
    }

    public static void dumpObject(Object o){
        dumpObject(o,new PrintWriter(System.out,true));
    }

    public static void dumpObject(Object o,PrintWriter writer){
        writer.println(o);
        writer.flush();
    }

}

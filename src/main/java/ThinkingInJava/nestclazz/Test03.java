package ThinkingInJava.nestclazz;

import org.junit.*;

/**
 * Created by adam on 2014/11/14.
 */
public class Test03 {

    public static class IClazz{
        public void myName(){
            System.out.println("myName");
        }

        public static void  myNameTwo(){
            System.out.println("myNameTwo");
        }
    }

    @org.junit.Test
    public void test01(){
        new IClazz().myName();
        IClazz.myNameTwo();;
    }
}

package TestThinkingInJava.interfaces;

/**
 * Created by adam on 2014/11/14.
 */
public class Test {

    @org.junit.Test
    public void test01(){
        InClass.InnerClass innerClass = new InClass().new InnerClass();
        innerClass.methodInB();
    }
}

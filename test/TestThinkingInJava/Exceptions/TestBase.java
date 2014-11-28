package TestThinkingInJava.Exceptions;

import org.junit.Test;

/**
 * Created by adam on 14-11-28.
 */
public class TestBase {

    @Test
    public void test01(){
        try {
            throw new RuntimeException("test run time");
        }catch(RuntimeException e){
//            throw new RuntimeException("22");
            System.out.println("catch run time");
        }
    }

    @Test
    public void test02(){
        throw new RuntimeException("22");
//        test01();
    }
}

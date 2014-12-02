package IntroAlgo.ch02.Java8.lambadaexpession;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by lab on 14-8-7.
 */
public class Test {

    public static void main(String[] args){
//        test01();
        test02();
    }

    public static void test02(){
        CallMyInterface.callInterface("adam",(String name)->{
            System.out.println("call in MyInterface Clouse .... ");
            return name;
        });
    }

    public static void test01(){
        List<String> names = Arrays.asList("adam","jack","kiti","yesk");

        Collections.sort(names,(a,b)->{
            return 1;
        });

        for(String n : names){
            System.out.println(n);
        }
    }

}

package IntroAlgo.ch02.Java8.accessObjectAndStaticVar;

import IntroAlgo.ch02.Java8.functionalInterface.Converor;

/**
 * Created by lab on 14-8-7.
 */
public class Test {

//    对象和静态变量的访问同匿名函数一样，访问的是应用，可以直接修改
    public static void test01(){
        MyClazz clazz = new MyClazz();

        Converor<String,Integer> convertor = (from) ->{
            clazz.myField = "adam";
            MyClazz.myStaticField = "staticAadam";

            return Integer.valueOf(from);
        };

        System.out.println(convertor.conver("12"));
        System.out.println(clazz.myField);
        System.out.println(MyClazz.myStaticField);
    }


    public static void main(String[] args){
        test01();
    }
}

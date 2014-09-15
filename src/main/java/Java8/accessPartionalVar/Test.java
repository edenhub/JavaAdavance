package Java8.accessPartionalVar;

import Java8.functionalInterface.Converor;

/**
 * Created by lab on 14-8-7.
 */
public class Test {

    public static void main(String[] args){
        test01();
    }

    public static void test01(){
        int num=1;

        Converor<String,Integer> convertor = (from) -> {
            return Integer.valueOf(from)+num;
        };

//        对于局部变量，相当于隐式final声明，只能当做final常量使用，不能在出现闭包后出现修改局部变量的情况
//        num++;

        System.out.println(convertor.conver("2"));
    }
}

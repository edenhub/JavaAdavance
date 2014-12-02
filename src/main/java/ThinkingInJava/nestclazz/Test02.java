package ThinkingInJava.nestclazz;

import org.junit.*;
import org.junit.Test;

/**
 * Created by adam on 2014/11/14.
 */
public class Test02 {

    class Wrapping{
        private int i;
        public Wrapping(int i){
            this.i = i;
        }

        public int getI(){
            return this.i;
        }
    }

    public Wrapping test01(){
        return new Wrapping(2){
            private int n = 2;

            public int getI(){
                System.out.println("over writing .... ");
                return super.getI();
            }
        };
    }

    @org.junit.Test
    public void test02(){
        System.out.println(test01().getI());
    }

    public MyInter test03(){
        return new MyInter() {
            private String name = "adam";
            @Override
            public String doIt(String message) {
                return "it say ; "+message;
            }
        };
    }

    public MyInter test04(String messageOut){
        return new MyInter() {
            @Override
            public String doIt(String message) {
                return messageOut+message;
            }
        };
    }

    @Test
    public void test05(){
        System.out.println(test03().doIt("ee"));
        System.out.println(test04("adam").doIt("ee"));
    }



    interface MyInter{
        public String doIt(String message);
    }
}

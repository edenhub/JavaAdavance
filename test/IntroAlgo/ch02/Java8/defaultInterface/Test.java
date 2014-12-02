package IntroAlgo.ch02.Java8.defaultInterface;

/**
 * Created by lab on 14-8-4.
 */
public class Test {

    public static void main(String[] args){
        MyInterface my = new MyInterface() {
            @Override
            public void doSomething() {
                System.out.println("Doing adam is things");
            }
        };

        my.doDefaultThing();
        my.doSomething();
    }
}

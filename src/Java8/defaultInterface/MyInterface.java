package Java8.defaultInterface;

/**
 * Created by lab on 14-8-4.
 */
public interface MyInterface {

    public void doSomething();

    public default void doDefaultThing(){
        System.out.println("Doing my default things");
    }
}

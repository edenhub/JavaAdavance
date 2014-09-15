package Java8.methodRef;

import java.util.function.Supplier;

/**
 * Created by lab on 14-8-7.
 */
public class PersonFunctory {

    public static Person create(Supplier<Person> supplier){
        return supplier.get();
    }


}

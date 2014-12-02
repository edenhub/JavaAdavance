package IntroAlgo.ch02.Java8.methodRef;


/**
 * Created by lab on 14-8-7.
 */
public class Test {

    public static void main(String[] args){
        test01();
    }

    public static void test01(){
        Person person = PersonFunctory.create(Person::new);

        System.out.println(person);
    }




}

package IntroAlgo.ch02.Java8.methodRef;

/**
 * Created by lab on 14-8-7.
 */
public class Person {

    public String firstName;
    public String lastName;

    public Person(){}

    public Person(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

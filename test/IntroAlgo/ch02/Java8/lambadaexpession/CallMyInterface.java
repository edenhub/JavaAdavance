package IntroAlgo.ch02.Java8.lambadaexpession;

/**
 * Created by lab on 14-8-7.
 */
public class CallMyInterface {


    public static void callInterface(String name,MyInterface myInterface){
        myInterface.callMe(name);

        System.out.println("End in CallMyInterface .... ");
    }
}

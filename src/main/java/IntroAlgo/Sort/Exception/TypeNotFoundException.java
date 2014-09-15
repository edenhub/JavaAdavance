package IntroAlgo.Sort.Exception;

/**
 * Created by lab on 14-8-10.
 */
public class TypeNotFoundException extends Exception {

    public TypeNotFoundException(){
        super();
    }

    public TypeNotFoundException(String message){
        super(message);
    }

    public TypeNotFoundException(Throwable tw){
        super(tw);
    }

    public TypeNotFoundException(String message,Throwable tw){
        super(message,tw);
    }
}

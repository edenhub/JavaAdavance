package ThinkingInJava.interfaces;

/**
 * Created by adam on 2014/11/14.
 */
public class InClass {

    public interface A{
        public void methodInA();
    }

    private interface B{
        public void methodInB();
    }

    public InnerClass getInnerClassInstance(){
        return new InnerClass();
    }

    public class InnerClass implements B{

        @Override
        public void methodInB() {
            System.out.println("InClass.B InnerClass ");
        }
    }
}


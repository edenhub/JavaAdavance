package ThinkingInJava.nestclazz;

/**
 * Created by adam on 2014/11/14.
 */
public class Test {

    public String testNestInMethod(){
        class classInMethod{
            public String doIt(){
                return "Do it";
            }
        }


        return new classInMethod().doIt();
    }

    public String testClassInStruct(boolean into){
        if(into){
            class classInStruct{
                public String doIt(){
                    return "Do it in Struct";
                }
            }

            return new classInStruct().doIt();
        }

        return "None";
    }

    @org.junit.Test
    public void test01(){
        System.out.println(testNestInMethod());
    }

    @org.junit.Test
    public void test02(){
        System.out.println(testClassInStruct(true));
    }
}

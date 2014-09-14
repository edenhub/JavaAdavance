package Java8.functionalInterface;

/**
 * Created by lab on 14-8-7.
 */
public class Test {

    public static void main(String[] args){
        test01();
        test02();
        test03();
    }

    public static void test01(){
        Converor<String,Integer> convertor = new Converor<String, Integer>() {
            @Override
            public Integer conver(String from) {
                return Integer.valueOf(from);
            }
        };

        System.out.println(convertor.conver("123"));
    }

    public static void test02(){
        Converor<String,Integer> convertor = (from)->{
            return Integer.valueOf(from);
        };

        System.out.println(convertor.conver("123"));
    }

    public static void test03(){
        Converor<String,Integer> convertor = Integer::valueOf;

        System.out.println(convertor.conver("123"));
    }
}

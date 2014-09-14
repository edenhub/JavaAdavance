package Java8.defaultFunctionInter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Created by lab on 14-8-7.
 */
public class Test {


    public static void test01(){
        Function<String,Integer> toInteger = (o) -> {
            return Integer.valueOf(o);
        };

        Function<Integer,Integer> plus = (o) -> {
            return o+2;
        };

        Function<Integer,String> toString = (o) ->{
            return String.valueOf(o);
        };

        System.out.println(toInteger.apply("12"));
        System.out.println(toInteger.andThen(plus).apply("12"));
        System.out.println(toInteger.compose(toString).apply(12));
        System.out.println(toInteger.compose(toString).andThen(plus).apply(12));
    }

    public static void test02(){
        Predicate<Integer> intPred = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer>0;
            }
        };

        Predicate<Integer> intPred2 = (o) -> {
            return o>0;
        };

        System.out.println(intPred.test(8));
        System.out.println(intPred2.test(8));
    }

    public static void test03(){
        Supplier<String> strSupplier = new Supplier<String>() {
            @Override
            public String get() {
                return "adam";
            }
        };

        Supplier<String> strSupplier2 = () -> {
            return "adam";
        };

        System.out.println(strSupplier.get());
        System.out.println(strSupplier2.get());
    }

    public static void test04(){
        Consumer<String> strConsumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("receive arg : "+s);
            }
        };

        Consumer<String> strConsume2 = (o) -> {
            System.out.println("receive arg : "+o);
        };

        strConsumer.accept("adam");
        strConsume2.accept("adam");
    }

//    排序是一个中间操作，返回的是排序好后的Stream。如果你不指定一个自定义的Comparator则会使用默认排序
//    需要注意的是，排序只创建了一个排列好后的Stream，而不会影响原有的数据源，排序之后原数据stringCollection是不会被修改的
    public static void test05(){
        List<String> list = Arrays.asList("bbb1","aaa2","ccc2","aaa1","bbb2","ccc1");
        list.stream()
                .filter((o) -> {
                    if (o.startsWith("a"))
                        return true;
                    else
                        return false;
                })
                .sorted().
                forEach(System.out::println);


    }


    static List<String> list = Arrays.asList("bbb1","aaa2","ccc2","aaa1","bbb2","ccc1");

    public static void test06(){
        list.stream()
                .filter((o) -> {
                    if (o.startsWith("a"))
                        return true;
                    else
                        return false;
                }).map((o) -> {
            return o.toUpperCase();
        }).sorted().forEach((o) -> {
            System.out.println(o);
        });

    }

    public static void test07(){
        boolean result = list.stream()
                .filter((o) -> o.startsWith("a"))
                .map((o) -> o.toUpperCase())
                .allMatch((o) -> o.startsWith("A"));

        System.out.println(result);
    }

    public static void test08(){
        Optional<String> result = list.stream()
                .map((o) -> o.toUpperCase())
                .sorted().reduce((s1,s2) -> {
                    System.out.println("inner : "+s1+ " : "+s2);
                    return s1+"#"+s2;

                });

        System.out.println(result.get());
    }

    public static void main(String[] args){
//        test01();
//        test02();
//        test03();

//        test04();
//        test05();
//        test06();
//        test07();
        test08();
    }
}

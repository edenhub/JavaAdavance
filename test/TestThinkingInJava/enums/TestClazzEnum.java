package TestThinkingInJava.enums;

import ThinkingInJava.enums.ClazzEnum;
import ThinkingInJava.enums.SetEnums;
import org.junit.Test;

import java.util.EnumSet;
import java.util.Iterator;

/**
 * Created by lab on 14-11-8.
 */
public class TestClazzEnum {

    @Test
    public void baseTest(){
        ClazzEnum name = ClazzEnum.First;

        System.out.println(name);
        System.out.println(name.description());
        testSwitch(name);

        for(ClazzEnum c : ClazzEnum.values())
            testSwitch(c);
    }

    public void testSwitch(ClazzEnum anEnum){
        switch (anEnum){
            case First: System.out.println("First"); break;
            case Second: System.out.println("Second"); break;
            case Third: System.out.println("Third"); break;
        }
    }

    @Test
    public void testEnumSet(){
        EnumSet<SetEnums> enumses = EnumSet.allOf(SetEnums.class);
        Iterator<SetEnums> iter = enumses.iterator();
        SetEnums s;
        while(iter.hasNext()){
            s = iter.next();
            System.out.println(s);
        }
    }
}

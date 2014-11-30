package ThinkingInJava.Patterns;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by adam on 14-11-28.
 */
public class TestBase {

    @Test
    public void test01(){
        final String str = "adamadam&&&adfaweakfeaadamadfweafadam";
        String pattern = "(adam)+";
        Pattern pattern1 = Pattern.compile(pattern);
        Matcher matcher = pattern1.matcher(str);
        while(matcher.find()){
            System.out.println(matcher.group());
            System.out.println(matcher.start());
            System.out.println(matcher.end());
        }
    }


}

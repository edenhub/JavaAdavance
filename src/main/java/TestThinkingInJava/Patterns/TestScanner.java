package TestThinkingInJava.Patterns;

import org.junit.Test;

import java.io.StringReader;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

/**
 * Created by adam on 14-11-28.
 */
public class TestScanner {

    @Test
    public void test01(){
        final String str = "58.27.82.161@2/10/2005\n" +
                "23.121.23.12@3/12/2009";
        String pa = "(\\d+[.]\\d+[.]\\d+[.]\\d+)@(\\d{1,}/\\d{2}/\\d{4})";
        Scanner scanner = new Scanner(new StringReader(str));
        Pattern pattern = Pattern.compile(pa);
        while(scanner.hasNext(pattern)){
            MatchResult match = scanner.match();
//            System.out.println(match.groupCount());
            System.out.println(match.group(1));
            System.out.println(match.group(2));
            System.out.println("=============================");
            scanner.next();
        }
    }

    @Test
    public void test02(){

        final String str = "58.27.82.161@2/10/2005\n" +
                "23.121.23.12@3/12/2009";
    }
}

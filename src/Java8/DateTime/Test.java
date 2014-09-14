package Java8.DateTime;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

/**
 * Created by lab on 14-8-7.
 */
public class Test {

    public static void test01(){
        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock.millis());

        Date date = Date.from(clock.instant());
        System.out.println(date.getTime());

        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalDate date1 = LocalDate.now();
        System.out.println(date1);
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        System.out.println(dateTime.getDayOfMonth());
    }

    public static void main(String[] args){
        test01();
    }
}

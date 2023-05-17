package Week14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        
        LocalDate today =  LocalDate.now();
        LocalTime now = LocalTime.of(15, 53, 25);
        LocalTime now2 = LocalTime.now();
        LocalDateTime dt = LocalDateTime.now();
        LocalDate elvinsBD = LocalDate.of(2005, 5, 10);
        LocalDate elvinsBD2 = LocalDate.of(2005, Month.MAY, 10);

        //10/05/2005

        DateTimeFormatter dtFormatter = DateTimeFormatter.ISO_WEEK_DATE;

        System.out.println(dtFormatter.format(elvinsBD));
        

    }
}

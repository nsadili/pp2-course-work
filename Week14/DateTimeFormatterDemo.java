package Week14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.of(15,53,25);
        LocalDateTime dt = LocalDateTime.now();
        LocalDate elvinsBD = LocalDate.of(2005, 5 ,10);
        
        DateTimeFormatter dtFormmater = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        System.out.println(dtFormmater.format(elvinsBD));
        System.out.println(DateTimeFormatter.ofPattern("hh:mm:ss a").format(now));

        System.out.println(today);
        System.out.println(now);
        System.out.println(dt);
    }
}

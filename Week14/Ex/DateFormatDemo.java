package Ex;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateFormatDemo {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        LocalDate ravanBD = LocalDate.of(2004, 5, 20);

        LocalTime now = LocalTime.now();

        LocalDateTime dt = LocalDateTime.now();

        // System.out.println(today);
        System.out.println(ravanBD);

        // System.out.println(now);

        // System.out.println(dt);

        // System.out.println(ravanBD.getMonth()+ "/" +
        // ravanBD.getDayOfMonth()+ "/"
        // + ravanBD.getYear());

        DateTimeFormatter dtFormatter = DateTimeFormatter.ISO_WEEK_DATE;

        DateTimeFormatter dtOurs = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(dtFormatter.format(ravanBD));

        System.out.println(dtOurs.format(ravanBD));

        DateTimeFormatter dt12Hours = DateTimeFormatter.ofPattern("hh:mm a");

        System.out.println(now);

        System.out.println(dt12Hours.format(now));

        // System.out.println(now.format(dt12Hours));

    }
}

package Week14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateFormatDemo {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        LocalDate eynarBE = LocalDate.of(2004, 8, 8);

        LocalTime now = LocalTime.now();

        LocalDateTime dt = LocalDateTime.now();

        // System.out.println(today);
        System.out.println(eynarBE);

        // System.out.println(now);

        // System.out.println(dt);

        // System.out.println(eynarBE.getMonth()+ "/" +
        // eynarBE.getDayOfMonth()+ "/"
        // + eynarBE.getYear());

        DateTimeFormatter dtFormatter = DateTimeFormatter.ISO_WEEK_DATE;

        DateTimeFormatter dtOurs = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(dtFormatter.format(eynarBE));

        System.out.println(dtOurs.format(eynarBE));

        DateTimeFormatter dt12Hours = DateTimeFormatter.ofPattern("hh:mm a");

        System.out.println(now);

        System.out.println(dt12Hours.format(now));

        // System.out.println(now.format(dt12Hours));

    }
}

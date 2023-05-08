import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.time;

public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate vusatsBD = LocalDate.of(2001, 8, 10);
        LocalDate vusatsBD2 = LocalDate.of(2001, AUGUST, 10);
        LocalTime now = LocalTime.now();
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(today);
        System.out.println(vusatsBD);
        System.out.println(vusatsBD2);
        System.out.println(now);
        System.out.println(dt);
        // 10/08/2001
        System.out.println(vusatsBD.getDayOfMonth() + "/"
                + vusatsBD.getMonthValue() + "/" + vusatsBD.getDayOfYear());
        DateTimeFormatter dtFormatter = DateTimeFormatter.ISO_WEEK_DATE;
        DateTimeFormatter dtOurs = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        System.out.println(dtFormatter.format(vusatsBD));
        System.out.println(dtOurs.format(vusatsBD));
        DateTimeFormatter dt12Hours = DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println(now);
        System.out.println(dt12Hours.format(now));
        System.out.println(now.format(dt12Hours));
    }
}

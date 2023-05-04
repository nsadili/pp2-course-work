import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {
    public static void main(String[] args) throws InterruptedException {

        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();
        LocalDateTime dt = LocalDateTime.now(ZoneId.of("Europe/Lisbon"));
        LocalDate narimansBD = LocalDate.of(2004,5, 13);
        LocalDate narimansBD2 = LocalDate.of(2004,Month.OCTOBER, 13);

        DateTimeFormatter dtFormatter = DateTimeFormatter.ISO_WEEK_DATE;
        DateTimeFormatter dTimeFormatter1 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy"); //      13/05/2004
        
        // Thread.sleep(1000);
        
        System.out.println(today);
        System.out.println(now);
        System.out.println();
        System.out.println(dt);
        System.out.println();
        System.out.println(dtFormatter.format(today));
        System.out.println(dTimeFormatter1.format(narimansBD));
        // System.out.println(DateTimeFormatter.ofPattern("hh:mm:ss a").format(now));

        // ZoneId.getAvailableZoneIds().stream().forEach(System.out::println);

    }
}

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;



public class DateTimeDemo {
    public static void main(String[] args) {
        
        LocalDate today = LocalDate.now();
        LocalDate vusatsBD = LocalDate.of(2001, 8, 10);
        LocalDate vusatsBD2 = LocalDate.of(2001, Month.AUGUST, 10);

        LocalTime now = LocalTime.now();
        LocalDateTime dt = LocalDateTime.now();

        DateTimeFormatter dtFormatter = DateTimeFormatter.ISO_WEEK_DATE;
        DateTimeFormatter dtOurs = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //System.out.println(today);
        //System.out.println(now);
        //System.out.println(dt);
        System.out.println(vusatsBD);
        System.out.println(vusatsBD.getDayOfMonth() + "/" + vusatsBD.getMonthValue() + "/" + vusatsBD.getYear());
        System.out.println(dtFormatter.format(vusatsBD));
        System.out.println(dtOurs.format(vusatsBD));


    }
}

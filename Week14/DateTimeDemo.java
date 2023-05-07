import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        var time = LocalTime.now();
        var dateTime = LocalDateTime.now();

        var myBirtday = LocalDate.of(2005, 9, 28);
        var myBirtday2 = LocalDate.of(2005, Month.SEPTEMBER, 28);

        DateTimeFormatter dtFormatter =  DateTimeFormatter.ISO_WEEK_DATE;
        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(dtFormatter.format(myBirtday));

        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_WEEK_DATE));

        System.out.println(myBirtday);
        System.out.println(myBirtday2);

        System.out.println(myBirtday.format(DateTimeFormatter.ofPattern(" d MMMM yy")));
        
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d MMM, yyyy hh:mm:ss a")));

    }
}
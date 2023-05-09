import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class DataTimeDemo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date.format(DateTimeFormatter.ISO_DATE));
        LocalTime time = LocalTime.now();
        System.out.println(time);
        var dateTime = LocalDateTime.now();
        System.out.println(dateTime.format(DateTimeFormatter.ISO_WEEK_DATE));
        var shamilsBDday = LocalDate.of(2004, 2, 19);
        var shamilsBDday1 = LocalDate.of(2004, Month.FEBRUARY,19);
        System.out.println(shamilsBDday.format(DateTimeFormatter.ofPattern("yyyy/MMMM/dd")));
        System.out.println(shamilsBDday1);
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d MMM, yyyy  hh:mm:ss a")));
    }
}

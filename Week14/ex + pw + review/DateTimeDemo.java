import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
    public static void main(String[] args) {
        
        LocalDate date = LocalDate.now();
        System.out.println(date.format(DateTimeFormatter.ISO_DATE));


        var time = LocalTime.now();
        System.out.println(time);


        var dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_WEEK_DATE));


        var ShamilsBDday = LocalDate.of(2004, 2, 19);
        var ShamilsBDday2 = LocalDate.of(2004, Month.FEBRUARY, 19);
        System.out.println(ShamilsBDday.format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));
        System.out.println(ShamilsBDday.format(DateTimeFormatter.ofPattern("yyyy/MMM/dd")));
        System.out.println(ShamilsBDday.format(DateTimeFormatter.ofPattern("yyyy/M/dd")));
        System.out.println(ShamilsBDday.format(DateTimeFormatter.ofPattern("yyyy/MMMM/dd")));
        System.out.println(ShamilsBDday.format(DateTimeFormatter.ofPattern("d MMMM yy")));
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d MMM, yyyy hh:mm:ss a")));




        System.out.println(ShamilsBDday2);


        

    }
}

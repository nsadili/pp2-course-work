import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
    


    public static void main(String[] args) {
        
            LocalDate date = LocalDate.now();


            LocalTime time = LocalTime.now();

            var dateTime = LocalDateTime.now();

            var shamilsBday = LocalDate.of(2004,02,19);
            var shamilsBday2 = LocalDate.of(2004,Month.FEBRUARY,19);

            // System.out.println(dateTime.format(DateTimeFormatter.ISO_WEEK_DATE));
            System.out.println(dateTime);
            System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d MMM, yyyy  hh:mm:ss a")));
            // System.out.println();

            System.out.println( shamilsBday.format(DateTimeFormatter.ofPattern("d MMMM yy")));
            System.out.println( shamilsBday2);

            





    }
}
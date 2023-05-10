
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
    
  public static void main(String[] args) {
    
    LocalDate lc= LocalDate.now();
  // System.out.println(lc.format(DateTimeFormatter.ISO_LOCAL_DATE));

    var time= LocalTime.now();
    var dateTime= LocalDateTime.now();
    var bd= LocalDate.of(2005,Month.JULY,16);
    
    //System.out.println(time);
  //  System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));
   // System.out.println(dateTime.format(DateTimeFormatter.ISO_WEEK_DATE));
    //System.out.println(bd.format(DateTimeFormatter.ofPattern("d, MMM, yyyy")));
  System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d, MMM, yyyy hh:mm:ss a")));
    
  }


}

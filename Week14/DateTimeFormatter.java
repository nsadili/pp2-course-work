import java.time.*;

public class DateTimeFormatter {
    public static void main(String[] args) {
        LocalDate Ldate = LocalDate.now(ZoneId.systemDefault());
        LocalTime  Ltime = LocalTime.of(15, 53, 25);
        LocalDateTime dt = LocalDateTime.now();
        
        System.out.println(Ldate);
        System.out.println(Ltime);
        System.out.println(dt);

        LocalDate muradsBD = LocalDate.of(2005, 1, 30);
        LocalDate muradsBD2 = LocalDate.of(2005, Month.JANUARY, 30);
        DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");

        System.out.println(dtFormatter.format(muradsBD));
        System.out.println(muradsBD2.format(dtFormatter));
        System.out.println(DateTimeFormatter.ofPattern("hh:mm:ss a").format(Ldate));
    }
}

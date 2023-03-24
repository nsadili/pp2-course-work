package Main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        System.out.println(d);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss.SSS");
        String s = sdf.format(d);
        System.out.println(s);

        SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy");

        String dt = "01-01-2020";
        Date d2 = sdf2.parse(dt);

        System.out.println(Math.abs(d2.getTime() - d.getTime()));


        Date dd = new Date(Math.abs(d2.getTime() - d.getTime()));
        System.out.println(dd);

    }
}

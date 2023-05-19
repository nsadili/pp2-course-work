package Week14;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Demo {

    public static void main(String[] args) {

        var value = 5123.45678;

        NumberFormat formatter = new DecimalFormat("###,###,###.0");

        System.out.println(formatter.format(value));



        
    }

}
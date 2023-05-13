

import java.text.DecimalFormat;
import java.text.NumberFormat;


public class NumberFormatDemo{

public static void main(String[] args) {
    
    var value = 1345446.4567;

    NumberFormat  formatter = new DecimalFormat("Balace: $ ###,###.00000") ;

    System.out.println(formatter.format(value));



}

}
package Week03.datetime;

import java.util.Scanner;

public class CustomDateTest {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int m= scan.nextInt();
            int days= scan.nextInt();
            int y= scan.nextInt();
            int m2=scan.nextInt();
            int days2= scan.nextInt();
            int y2=scan.nextInt();

            

            CustomDate d1= new CustomDate(m,days,y);
            CustomDate d2= new CustomDate(m2,days2,y2);
      
            System.out.println("First date:");
            d1.displayDate();
            d1.displayFormatted();

            System.out.println("Second date:");
            d2.displayDate();
            d2.displayFormatted();

            System.out.println("Comparison between first and second date "+CustomDate.compare(d1, d2));
            System.out.println("Comparison between second and first date "+CustomDate.compare(d2, d1));
            System.out.println("The difference between first and second day " +d1.difference(d2)+"days");
            System.out.println("The difference between second and first day " +d2.difference(d1)+"days");
        }


    }

 
    
}

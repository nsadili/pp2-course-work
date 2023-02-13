package Week03.CustomDate;

public class CustomDateTest {
    public static void main(String[] args) {

        CustomDate date1 = new CustomDate(3, 15, 2022);
        CustomDate date2 = new CustomDate(1, 8, 2020);

        date1.displayDate();
        date2.displayFormatted();

         // Compare the dates
         int comparison = CustomDate.compare(date1, date2);
         if (comparison < 0) {
             System.out.println("Date 2 is later than Date 1");
         } else if (comparison > 0) {
             System.out.println("Date 1 is later than Date 2");
         } else {
             System.out.println("Date 1 and Date 2 are the same");
         }
 
         // Get the difference between the dates
         int difference = date1.difference(date2);
         System.out.println("The difference between the two dates is " + difference + " days");
     }
    }

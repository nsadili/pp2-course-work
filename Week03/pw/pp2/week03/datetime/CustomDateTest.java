public class CustomDateTest {
    
    public static void main(String[] args) {
        

        CustomDate date1 = new CustomDate(2, 11, 2021);
        CustomDate date2 = new CustomDate(7, 21, 2017);
        System.out.println("Displaying date1 : ");
        date1.displayDate();
        System.out.println();
    
        System.out.println("Displaying date2 : ");
        date2.displayFormatted();
        System.out.println();
    
        System.out.println(" difference between date1 and date2: " + date1.difference(date2));
        System.out.println();
    
        System.out.println("Comparing date1 and date2: ");
        int comparisonResult = CustomDate.compare(date1, date2);
        if (comparisonResult > 0) {
          System.out.println("date1 is earlier");
        } else if (comparisonResult < 0) {
          System.out.println("date2 is earlier");
        } else {
          System.out.println("date1 and date2 are the same");
        }
      }
    }

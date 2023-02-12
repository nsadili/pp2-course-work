public class CustomDateTest {
    public static void main(String[] args) {
       CustomDate date1 = new CustomDate(1, 12, 2020);
       CustomDate date2 = new CustomDate(3, 15, 2021);
 
       date1.displayDate();
       date2.displayDate();
 
       int difference = date1.difference(date2);
       System.out.println("Difference in days: " + difference);
 
       int compareResult = CustomDate.compare(date1, date2);
       System.out.println("Compare result: " + compareResult);
 
       date1.displayFormatted();
       date2.displayFormatted();
    }
}
 
 
 
 
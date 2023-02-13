
public class CustomDateTest {
    
        public static void main(String[] args) {
            CustomDate date1 = new CustomDate(11, 3, 2005);
            CustomDate date2 = new CustomDate(12, 12, 2020);
    
            date1.displayDate();
            date2.displayFormatted();
    
            int difference = date1.difference(date2);
            System.out.println("Difference in days: " + difference);
    
            int comparisonResult = CustomDate.compare(date1, date2);
            System.out.println("Comparison result: " + comparisonResult);
        }
    
    
}

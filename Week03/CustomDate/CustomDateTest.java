package Week03.CustomDate;

public class CustomDateTest {
    public static void main(String[] args) {

        CustomDate date1 = new CustomDate(1, 1, 2020);
        CustomDate date2 = new CustomDate(2, 28, 2020);

        date1.displayDate();
        date2.displayFormatted();

        System.out.println("Difference between date1 and date2: " + date1.difference(date2));
        System.out.println("Compare date2 and date1");
        
    }
}

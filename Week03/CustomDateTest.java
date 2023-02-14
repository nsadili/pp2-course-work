package Week03;

public class CustomDateTest {
    public static void main(String[] args) {
        
        CustomDate date1 = new CustomDate(9, 69, -40);
        CustomDate date2 = new CustomDate(3, 6, 2001);
        CustomDate date3 = new CustomDate(2, 28, 2022);
        CustomDate date4 = new CustomDate(4, 16, 1600);
        
        date3.displayFormatted();
        date1.displayDate();
        
        System.out.println(date2.difference(date3));
        System.out.println(CustomDate.compare(date2, date3));
        
        date2.displayFormatted();
        date2.displayDate();
        date4.displayDate();
        
        System.out.println(date4.difference(date3));
    }
}

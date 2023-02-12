import pp2.week03.datetime.CustomDate;

public class  CustomDateTest {
    public static void main(String[] args) {
        
        CustomDate CD = new CustomDate(14,8,1978);
        CustomDate date1 = new CustomDate(11,2,2023);
        CustomDate date2 = new CustomDate(23,1,2023);

        System.out.printf("Let's Display Our Date: %s\n\n", CD.displayDate());
        System.out.printf("The Difference between %s and %s: %d days\n\n", CD.displayDate(), date1.displayDate(), CD.difference(date1));
        System.out.printf("Let's Compare %s and %s: %s\n\n", date1.displayDate(), date2.displayDate(), CD.compare(date1, date2));
        System.out.printf("We can display %s with month words: %s", CD.displayDate(), CD.displayFormatted());

    }
        
}
import pp2.week03.datetime.CustomDate;

public class CustomDateTest {

    public static void main(String[] args) {
        CustomDate date1 = new CustomDate(2, 19, 2023);
        CustomDate date2 = new CustomDate(2, 20, 2023);
        CustomDate date3 = new CustomDate(2, 19, 2023);

        System.out.println("Date 1:");
        date1.displayDate();

        System.out.println("Number of days between date1 and date2: " + date1.difference(date2));

        System.out.println("Comparing date1 and date2: " + CustomDate.compare(date1, date2));
        System.out.println("Comparing date2 and date1: " + CustomDate.compare(date2, date1));
        System.out.println("Comparing date1 and date3: " + CustomDate.compare(date1, date3));
        System.out.println("Comparing date3 and date1: " + CustomDate.compare(date3, date1));

        System.out.println("Date 1 (formatted):");
        date1.displayFormatted();
    }

}

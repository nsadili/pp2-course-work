import pp2.week03.datetime.CustomDate;

public class CustomDateTest {
    public static void main(String[] args) {
        CustomDate date1 = new CustomDate(3, 10, 2018);
        CustomDate date2 = new CustomDate(2, 30, 2021);
        
        // Checking display format of the dates
        System.out.printf("date 1 ", date1);
        date1.displayFormatted();
        System.out.printf("date 2 ", date2);
        date2.displayFormatted();


        //Checking difference between date1 and date2
        System.out.println("difference" + date1.difference(date2));

        //Comparing to see which one is earlier
        switch (CustomDate.compare(date1, date2)) {
            case 1:
                System.out.println("Date 1 is earlier");
                break;
            case -1:
                System.out.println("Date 2 is earlier");
                break;
            case 0:
                System.out.println("Date 1 and Date 2 are the same");
                break;
        }
    }
}
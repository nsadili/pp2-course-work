public class CustomDateTest {
    public static void main(String[] args) {
        CustomDate date1 = new CustomDate(1, 1, 2022);
        CustomDate date2 = new CustomDate(12, 25, 2020);

        System.out.println("Date 1: ");
        date1.displayDate();
        date1.displayFormatted();

        System.out.println("Date 2: ");
        date2.displayDate();
        date2.displayFormatted();

        int difference = date1.difference(date2);
        System.out.println("Difference between date 1 and date 2: " + difference + " days");

        int result = CustomDate.compare(date1, date2);
        if (result == 1) {
            System.out.println("Date 1 is earlier");
        } else if (result == -1) {
            System.out.println("Date 2 is earlier");
        } else {
            System.out.println("Dates are the same");
        }
    }
}

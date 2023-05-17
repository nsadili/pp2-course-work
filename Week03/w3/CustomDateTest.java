public class CustomDateTest {
    public static void main(String[] args) {
        CustomDate date1 = new CustomDate(06,11, 1998);
        CustomDate date2 = new CustomDate(23, 08, 20005);

        System.out.println("The Date 1 is: ");
        date1.displayDate();
        date1.displayFormatted();

        System.out.println();

        System.out.println("The Date 2 is: ");
        date2.displayDate();
        date2.displayFormatted();

        System.out.println();

        System.out.println(CustomDate.compare(date1, date2));
    }
}

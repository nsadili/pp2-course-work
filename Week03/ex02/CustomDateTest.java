public class CustomDateTest {
    public static void main(String[] args) {
        CustomDate date1 = new CustomDate();
        CustomDate date2 = new CustomDate();

        date1.setDay(31);
        date1.setMonth(03);
        date1.setYear(2004);

        date2.setDay(01);
        date2.setMonth(06);
        date2.setYear(1999);

        System.out.println("Date1: " + date1.displayDate());
        System.out.println("Date2: " + date2.displayDate());
        System.out.println("Difference between Date 1 and Date 2: " + date1.difference(date2) + " in days");
        System.out.println("Compare result: " + CustomDate.compare(date1, date2));
        System.out.println("Dateformatted1: " + date1.displayFormatted());
        System.out.println("Dateformatted2: " + date2.displayFormatted());
    }
}

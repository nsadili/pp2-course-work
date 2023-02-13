package Week03.CustomDate;

public class CustomDateTest {
    public static void main(String[] args) {

        CustomDate date1 = new CustomDate(2,14,2023);
        CustomDate date2 = new CustomDate(2,28,2023);


        date1.displayFormatted();
        date1.displayDate();
        System.out.println(date1.difference(date2));
        System.out.println(CustomDate.compare(date1, date2));

    }

}


package Week03.pp2.datetime;

public class CustomDateTest {
        public static void main(String[] args) {
            CustomDate date1 = new CustomDate(10, 18, 2004);
            CustomDate date2 = new CustomDate(11, 24, 2002);

            System.out.println("Date 1: ");
            date1.displayDate();
            System.out.println("Date 2: ");
            date2.displayDate();

        }
    }



import pp2.week03.datetime.CustomDate;

public class CustomDateTest {
    public static void main(String[] args) {
        CustomDate a = new CustomDate(9, 28, 2005);
        CustomDate b = new CustomDate(2, 16, 2023);
        displayDate();
        System.out.printf("%d", difference(a));
        System.out.println(compare(a, b));
        System.out.println(display());
        displayFormated();

    }
}

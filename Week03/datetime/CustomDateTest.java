package Week03.datetime;

public class CustomDateTest {
    public static void main(String[] args) {
        CustomDate customDate=new CustomDate(12,2,3);
        CustomDate customDate1=new CustomDate(13,2,4);
        System.out.println(customDate.difference(customDate1));

    }
}

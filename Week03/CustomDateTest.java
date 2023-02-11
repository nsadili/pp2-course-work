public class CustomDateTest {
    public static void main(String[] args) {
        CustomDate date = new CustomDate(2,5,2023);
        System.out.println(date.getDate());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
        System.out.println(date.DisplayDate());
        //System.out.println(date.CustomDate());
    }
}

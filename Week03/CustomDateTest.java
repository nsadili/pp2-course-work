public class CustomDateTest {
    public static void main(String[] args) {
        CustomDate a = new CustomDate(29, 2, 2004);
        CustomDate b = new CustomDate(20,3,2005);
        System.out.println(a.getDay());
        System.out.println(a.displayDate());
        System.out.println(a.difference(b));
        System.out.println(CustomDate.compare(a, b));
        System.out.println(a.displayFormatted());
    }

    

    
}

public class CustomDateTestApp {
    public static void main(String[] args){
        CustomDate date1 = new CustomDate(23,7,2015);
        CustomDate date2 = new CustomDate(4,2,2016);

        System.out.println(date1.getDay());
        System.out.println(date2.getYear());
        date1.displayFormatted();
        System.out.println(date1.difference(date2));
    }
}

import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        CustomDate date1=new CustomDate(2,19,2023);
        CustomDate date2=new CustomDate(1,1,1);
        int m=scn.nextInt();
        int d=scn.nextInt();
        int y=scn.nextInt();
        date2.setMonth(m);
        date2.setDay(d);
        date2.setYear(y);
        date2.displayDate();
        System.out.println(" ");
        System.out.println(date1.difference(date2)*-1);
        System.out.println(" ");
        CustomDate.compare(date1, date2);
        System.out.println(" ");
        date1.displayFormatted();
         
    }
}

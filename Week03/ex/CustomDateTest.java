import pp2.week3.datetime.CustomDate;

public class CustomDateTest {

    public static void main(String[] args) {

        CustomDate c = new CustomDate(19, 2, 2005);
        CustomDate c2 = new CustomDate(22, 2, 2005);


        System.out.println(c.getDay()+", "+ c.getMonth()+", "+c.getYear());


        c.displayDate();
        c2.displayDate();

        c.displayFormatted();
        c2.displayFormatted();

        
        System.out.println(c.compare(c, c2));
    

        c.setDay(3);
        System.out.println(c.getDay());

      

      // c.difference(c2);

    }

}
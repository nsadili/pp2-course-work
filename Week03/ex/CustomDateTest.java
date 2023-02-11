import pp2.week3.datetime.CustomDate;

public class CustomDateTest{

    public static void main(String[] args) {

        CustomDate c=new CustomDate(22, 2, 12);
        CustomDate c2=new CustomDate(22,2,12);
        System.out.println(c.compare(c, c2));

        
    }

}
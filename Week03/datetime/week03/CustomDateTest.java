package Week03.datetime.week03;

public class CustomDateTest {
    public static void main(String [] args)
    {
        CustomDate CD = new CustomDate(01, 14, 2020);

        System.out.println("The Custom Date: ");
        CD.displayDate(01, 14, 2020);
        System.out.println("The other one: ");
        CustomDate date = new CustomDate(12, 12, 2023);
        CD.displayDate(1, 12, 2020);
        System.out.println("Difference between them : ");
        System.out.println(CD.difference(date));
        System.out.println("2020 leap year?: ");
        System.out.println(CD.isleapYear(2020));
        
        // System.out.println(difference());
        CustomDate date1 = new CustomDate(04, 11, 2015);
        CustomDate date2 = new CustomDate(02, 11, 2012);
        System.out.println("DATE1  ");
        CD.displayFormatted(04, 11, 2015);
        System.out.println("DATE2  ");
        CD.displayFormatted(02, 11, 2012);
        System.out.println("Comparison: ");
        System.out.println(CD.compare(date1, date2)+ "  -->means the first one bigger");
    }   

    
}
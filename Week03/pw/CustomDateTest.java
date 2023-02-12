import pp2.week03.datetime.CustomDate;
public class CustomDateTest {
public static void main(String[] args) {

    int month = Integer.parseInt(args[0]);
    int day = Integer.parseInt(args[1]);
    int year = Integer.parseInt(args[2]);

    
    CustomDate date1 = new CustomDate(04, 11, 2005);
    CustomDate date2 = new CustomDate(month, day, year);


    System.out.print("Month/Day/Year: ");
    date1.displayDate();
    //System.out.println("Month/Day/Year: " + date.getMonth() + "/" + date.getDay() + "/" + date.getYear());


    System.out.println("The difference between the given terms: " + date1.difference(date2));
    
    System.out.println("Which term is earlier? " + date1.compare(date1, date2));
    System.out.print("The format of the given term: ");
    date1.displayFormatted();

}



}

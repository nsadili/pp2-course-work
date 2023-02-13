import pp2.week03.geometry.CustomDate;
public class CustomDateTest {
    public static void main(String[] args){
        CustomDate date1 = new CustomDate(9, 28, 2005);
        CustomDate date2 = new CustomDate(11,19,2008);

        System.out.println(date1.displayDate);
        System.out.println(date2.displayDate);

        date1.displayDate();
        date2.displayFormatted();


        int difference = date1.difference(date2);
        System.out.println("Difference in days: " + difference);

        int comparisonResult = CustomDate.compare(date1, date2);
        System.out.println("Comparison result: " + comparisonResult);


    }

}

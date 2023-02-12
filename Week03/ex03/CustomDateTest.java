public class CustomDateTest
{
    public static void main(String[] args)
    {
        CustomDate date1 = new CustomDate(2, 28, 2022);
        CustomDate date2 = new CustomDate(2, 13, 2022);
        //CustomDate currentDate = new CustomDate(LocalDate.now().getMonthValue(), LocalDate.now().getDayOfMonth(), LocalDate.now().getYear());
        date1.displayDate();
        date2.displayDate();
        CustomDate.compare(date1, date2);
        date1.displayFormatted();


        //long difference = date1.difference(currentDate);

        System.out.println("Month is : " + date1.getMonth());
        System.out.println("Day is : " + date1.getDay());
        System.out.println("Year is : " + date1.getYear());
        System.out.println("Comparison result : " + CustomDate.compare(date1, date2));
        
        
       // System.out.println("Difference in days is : " + difference);
        
    }
}
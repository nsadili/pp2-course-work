public class Main {
    public static void main(String[] args) {

        CustomDate date1= new CustomDate(5,8,2020);
        CustomDate date2=new CustomDate(9,4,2022);

        date1.DisplayDate();
        date1.setYear(2023);

        date1.difference(date2);
        date1.compare(date1, date2);

        date2.displayFormatted();

    }
}

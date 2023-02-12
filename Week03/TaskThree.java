//CUSTOM_DATE.JAVA
package pp2.week03.datetime;

public class CustomDate {
    private int month;
    private int day;
    private int year;


    public CustomDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayDate() {
        System.out.println(this.month + "/" + this.day + "/" + this.year);
    }

    public void difference(int month, int day, int year) {
        if (month > 12) {
            System.out.println("The month can not be bigger than 12");
        } else if (day > 31) {
            System.out.println("The day can not be bigger than 31");
        } else {
            System.out.println(this.day - day);
        }
    }

    public static int compare(int day1, int month1, int year1, int day2, int month2, int year2) {
        if ((year2 - year1) > 0) {
            return 1;
        } else if ((year2 - year1) < 0) {
            return 2;
        } else if ((year2 - year1 == 0) && ((month2 - month1 > 0) && !(month2 == 12))) {
            return 1;
        } else if ((year2 == year1) && ((month2 - month1) < 0) && !(month2 == 12)) {
            return 2;
        }else if ((year1 == year2) && (month1 == month2) && ((day2 - day1) > 0)) {
            return 1;
        } else if((year1 == year2) && (month1 == month2) && ((day2 - day1) < 0)) {
            return 2;
        }else{
            return 0;
        }
    }
    public void displayFormatted(int month, int day, int year){
        System.out.print(day + " ");
        if(month == 12){
            System.out.print("December");
        }else if(month == 1){
            System.out.print("January");
        }else if(month == 2){
            System.out.print("February");
        }else if(month == 3){
            System.out.print("March");
        }else if(month == 4){
            System.out.print("April");
        }else if(month == 5){
            System.out.print("May");
        }else if(month == 6){
            System.out.print("June");
        }else if(month == 7){
            System.out.print("July");
        }else if(month == 8){
            System.out.print("August");
        }else if(month == 9){
            System.out.print("September");
        }else if(month == 10){
            System.out.print("October");
        }else if(month == 11){
            System.out.print("November");
        }
        System.out.print(" " + year);
    }
}

//CUSTOM _DATE_TEST.JAVA
package pp2.week03.datetime;

public class CustomDateTest {

    public static void main(String[] args) {
        CustomDate customdate = new CustomDate(12, 13, 2023);
        customdate.displayDate();
        customdate.difference(12, 11, 2023);
        System.out.println(CustomDate.compare(14, 10, 2024, 14, 12, 2024));
        customdate.displayFormatted(5, 13, 2025);
    }

}

package Week03.datetime;
import java.util.Scanner;

class CustomDate{
    int month, day, year;

    public CustomDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay(){
        return day;
    }

    void setDay(int day){
        this.day = day;
    }

    public int getMonth(){
        return month;
    }

    void setMonth(int month){
        this.month = month;
    }

    public int getYear(){
        return year;
    }

    void setYear(int year){
        this.year = year;
    }

    public void displayDate(int day, int month, int year){
        System.out.println(month + "/" + day + "/" + year);
    }

    public int difference(CustomDate date){
        int dd = this.day - date.day;
        int dm = this.month - date.month;
        int dy = this.year - date.year;
        return dd + dm * 30 + dy * 365;
    }

    public static int compare(CustomDate date1, CustomDate date2){
        if(date1.year > date2.year) return -1;
        else if(date1.year < date2.year) return 1;
        else{
            if(date1.month > date2.month) return -1;
            else if(date1.month < date2.month) return 1;
            else{
                if(date1.day > date2.day) return -1;
                else if(date1.day < date2.day) return 1;
                else return 0;
            }
        }
    }

    public void displayFormatted(){
        switch(month){
            case 1: 
                System.out.println(day + " Jan " + year);
                break;
            case 2: 
                System.out.println(day + " Feb " + year);
                break;
            case 3: 
                System.out.println(day + " March " + year);
                break;
            case 4: 
                System.out.println(day + " April " + year);
                break;
            case 5: 
                System.out.println(day + " May " + year);
                break;
            case 6: 
                System.out.println(day + " June " + year);
                break;
            case 7: 
                System.out.println(day + " July " + year);
                break;
            case 8: 
                System.out.println(day + " Aug " + year);
                break;
            case 9: 
                System.out.println(day + " Sep " + year);
                break;
            case 10: 
                System.out.println(day + " Oct " + year);
                break;
            case 11: 
                System.out.println(day + " Nov " + year);
                break;
            case 12: 
                System.out.println(day + " Dec " + year);
                break;
        }
    }
}

class CustomDateTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        CustomDate date1 = new CustomDate(day, month, year);

        date1.displayDate(day, month, year);

        int day2 = sc.nextInt();
        int month2 = sc.nextInt();
        int year2 = sc.nextInt();
        CustomDate date2 = new CustomDate(day2, month2, year2);
        System.out.println("Difference between dates in days: " + date2.difference(date2));

        
        int day3 = sc.nextInt();
        int month3 = sc.nextInt();
        int year3 = sc.nextInt();
        CustomDate date3 = new CustomDate(day3, month3, year3);

        int day4 = sc.nextInt();
        int month4 = sc.nextInt();
        int year4 = sc.nextInt();
        CustomDate date4 = new CustomDate(day4, month4, year4);

        System.out.println(CustomDate.compare(date3, date4));

        date1.displayFormatted();

        sc.close();
    }
} 
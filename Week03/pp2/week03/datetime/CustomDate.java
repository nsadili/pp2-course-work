package pp2.week03.datetime;

public class CustomDate {
    private int month;
    private int day;
    private int year;

    public CustomDate(int month, int day, int year) {
        this.month = 5;
        this.day = 29;
        this.year = 2022;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void displayDate(){
        System.out.printf("%d/%d/%d", month,day,year);
    }
    public int difference(CustomDate date){
        return date.year*365+date.month*30+date.day- this.year*365-this.month*30-this.day;
    }
    public int compare(CustomDate date1, CustomDate date2){
        if(date2.year>date1.year) return 1;
        if(date2.year<date1.year) return 2;
        else{
            if(date2.month>date1.month) return 1;
            if(date2.month<date1.month) return 2;
            else{
                if(date2.day>date1.day) return 1;
                if(date2.day<date1.day) return 2;
                else return 0;
            }
        }
    }
    public void displayFormated(){
        switch(month){
            case 1:
            System.out.println(day+" Jan "+year);
            break;
            case 2:
            System.out.println(day+" Feb "+year);
            break;
            case 3:
            System.out.println(day+" Mar "+year);
            break;
            case 4:
            System.out.println(day+" Apr "+year);
            break;
            case 5:
            System.out.println(day+" May "+year);
            break;
            case 6:
            System.out.println(day+" Jun "+year);
            break;
            case 7:
            System.out.println(day+" Jul "+year);
            break;
            case 8:
            System.out.println(day+" Aug "+year);
            break;
            case 9:
            System.out.println(day+" Sep "+year);
            break;
            case 10:
            System.out.println(day+" Oct "+year);
            break;
            case 11:
            System.out.println(day+" Nov "+year);
            break;
            case 12:
            System.out.println(day+" Dec "+year);
            break;
        }
    }
}

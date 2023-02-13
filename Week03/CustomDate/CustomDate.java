package Week03.CustomDate;

public class CustomDate {
    private int day;
    private int month;
    private int year;

    public CustomDate(int month, int day, int year) {
       if(isValidDate(day,month,year)){
           this.day = day;
           this.month = month;
           this.year = year;
       }
       else{
           System.out.println("Date is not valid..");
       }

    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayDate(){
        System.out.println(this.month+"/"+this.day+"/"+this.year);
    }
    public void displayFormatted(){
        String monthText;
        switch (this.month){
            case 1:
                monthText = "Jan";
                break;
            case 2:
                monthText = "Feb";
                break;
            case 3:
                monthText = "March";
                break;
            case 4:
                monthText = "Apr";
                break;
            case 5:
                monthText = "May";
                break;
            case 6:
                monthText = "Jun";
                break;
            case 7:
                monthText = "Jul";
                break;
            case 8:
                monthText = "Aug";
                break;
            case 9:
                monthText = "Sep";
                break;
            case 10:
                monthText = "Oct";
                break;
            case 11:
                monthText = "Nov";
                break;
            default:
                monthText = "Dec";
                break;

        }
        System.out.println(this.day+" "+monthText+" "+this.year);
    }
    public static int compare(CustomDate date1, CustomDate date2){
        int firstDateDays = date1.countDays(date1);
        int secondDateDays = date2.countDays(date2);
        if(firstDateDays-secondDateDays>0){
            return -1;
        } else if (firstDateDays-secondDateDays<0) {
            return 1;
        }else {
            return 0;
        }
    }
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }
    public int difference(CustomDate date2){
        int firstDateDays = countDays(this);
        int secondDateDays = countDays(date2);

        return Math.abs(secondDateDays - firstDateDays);
    }

    public int countDays(CustomDate date) {
        int currentDate = date.year * 365 + date.day;
        for (int i = 1; i < date.month; i++) {
            switch (i) {
                case 2:
                    currentDate += isLeapYear(date.year) ? 29 : 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    currentDate += 30;
                    break;
                default:
                    currentDate += 31;
            }
        }
        return currentDate;
    }
    public static boolean isValidDate(int day, int month, int year) {
        if (month < 1 || month > 12) {
            return false;
        }

        int maxDays;
        switch (month) {
            case 2:
                maxDays = isLeapYear(year) ? 29 : 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                maxDays = 30;
                break;
            default:
                maxDays = 31;
        }

        if (day < 1 || day > maxDays) {
            return false;
        }

        return true;
    }
}

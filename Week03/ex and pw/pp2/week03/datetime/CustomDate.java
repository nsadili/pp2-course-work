package pp2.week03.datetime;

public class CustomDate {

    private int month;
    private int day;
    private int year;

    public CustomDate(int month, int day, int year) {

        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
                && (day >= 1 && day <= 31))
            this.day = day;


        else if (month == 2) {
            if (year % 400 == 0 && day >= 1 && day <= 29)
                this.day = day;
            else if (year % 100 != 0 && year % 4 == 0 && day >= 1 && day <= 29)
                this.day = day;
            else if (day >= 1 && day <= 28)
                this.day = day;

        }

       else if ((month == 4 || month == 6 || month == 9 || month == 11) && day >= 1 && day <= 30)
            this.day = day;

            if (year > 0)
            this.year = year;

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

    public void displayDate() {
        System.out.println(this.month + "/" + this.day + "/" + this.year);
    }

    
    public int compare(CustomDate date1, CustomDate date2) {
        if (date1.year == date2.year && date1.month == date2.month) {
            if (date1.day > date2.day)
                return -1;
            if (date1.day < date2.day)
                return 1;
            else
                return 0;
        }

        else if (date1.year == date2.year) {
            if (date1.month > date2.month)
                return -1;
            if (date1.month < date2.month)
                return 1;
            else
                return 0;
        }

        else {
            if (date1.year > date2.year)
                return -1;
            if (date1.year < date2.year)
                return 1;
            else
                return 0;

        }

    }

    public void displayFormatted() {
        System.out.printf("%d ", day);
        switch (month) {
            case 1:
                System.out.printf("Jan ");
                break;
            case 2:
                System.out.printf("Feb ");
                break;
            case 3:
                System.out.printf("Mar ");
                break;
            case 4:
                System.out.printf("Apr ");
                break;
            case 5:
                System.out.printf("May ");
                break;
            case 6:
                System.out.printf("June ");
                break;
            case 7:
                System.out.printf("July ");
                break;
            case 8:
                System.out.printf("Aug ");
                break;
            case 9:
                System.out.printf("Sep ");
                break;
            case 10:
                System.out.printf("Oct");
                break;
            case 11:
                System.out.printf("Nov");
                break;
            case 12:
                System.out.printf("Dec ");
                break;
        }
        System.out.println(this.year);
    }

}
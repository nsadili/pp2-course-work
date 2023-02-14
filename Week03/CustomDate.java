import java.lang.String;
class CustomDate {
    private int day;
    private int month;
    private int year;
    boolean flag;

    public CustomDate(int day, int month, int year) {
        if (day > 0 && ((day < 32 && month != 2) || (day < 29 && month == 2)
                || (day < 30 && year % 4 == 0 && month == 2))) {
            this.day = day;
        } else {
            System.out.println("Please enter valid day");
            flag = false;
        }
        if (month < 13 && month > 0) {
            this.month = month;
        } else {
            System.out.println("Please enter valid month");
            flag = false;
        }
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day > 0 && (day < 32 || (day < 29 && month == 2) || (day < 30 && year % 4 == 0))) {
            this.day = day;
        } else {
            System.out.println("Please enter valid day");
            flag = false;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 13 && month > 0) {
            this.month = month;
        } else {
            System.out.println("Please enter valid month");
            flag = false;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String displayDate() {
        if (flag) {
            return (day + "/" + month + "/" + year);
        } else {
            return "Invalid date";
        }
    }

    public String difference(CustomDate date) {
        if(flag){
            int dif = date.getDay() - this.getDay();
        if (dif < 0)
            dif = -dif;
            String d = String.valueOf(dif);
            return d;
        }
        else{
            return "Follow instructions";
        }
    }

    public static String compare(CustomDate date1, CustomDate date2) {
        int dif1 = date1.getDay() - date2.getDay();
        int dif2 = date1.getMonth() - date2.getMonth();
        int dif3 = date1.getYear() - date2.getYear();

        if (dif3 > 0) {
            if (dif2 > 0) {
                if (dif1 > 0) {
                    return "1";
                } else if (dif1 < 0) {
                    return "-1";
                }
            } else if (dif2 < 0) {
                return "-1";
            }
        } else if (dif3 < 0) {
            return "-1";
        } else {
            return "0";
        }
        return null;
    }

    public String displayFormatted() {
        if (flag) {
            String monthName = "a";
            switch (this.month) {
                case 12:
                    monthName = "Dec";
                    break;
                case 1:
                    monthName = "Jan";
                    break;
                case 2:
                    monthName = "Feb";
                    break;
                case 3:
                    monthName = "March";
                    break;
                case 4:
                    monthName = "April";
                    break;
                case 5:
                    monthName = "May";
                    break;
                case 6:
                    monthName = "June";
                    break;
                case 7:
                    monthName = "Julu";
                    break;
                case 8:
                    monthName = "Aug";
                    break;
                case 9:
                    monthName = "Sept";
                    break;
                case 10:
                    monthName = "Oct";
                    break;
                case 11:
                    monthName = "Nov";
                    break;
            }
            return day + " " + monthName + " " + year;
        } else {
            return "Follow Instructions Correctly";
        }
    }
}

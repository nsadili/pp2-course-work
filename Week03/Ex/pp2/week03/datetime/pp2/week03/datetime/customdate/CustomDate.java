package pp2.week03.datetime.customdate;

public class CustomDate {
    private int Month; // Month
    private int Day; // Day
    private int Year; // Year

    public CustomDate(int Month, int Day, int Year) {
        this.Month = Month;
        this.Day = Day;
        this.Year = Year;
    }

    public int getMonth() {
        return Month;
    }

    public int getDay() {
        return Day;
    }

    public int getYear() {
        return Year;
    }

    public void setMonth(int Month) {
        this.Month = Month;
    }

    public void setDay(int Day) {
        this.Day = Day;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public String displayDate() {
        return this.Month + "/" + this.Day + "/" + this.Year;
    }

    public String DIFF(CustomDate date) // DIFF = difference of date
    {
        int yearDIFF = this.Year - date.Year;
        int monthDIFF = this.Month - date.Month;
        int dayDIFF = this.Day - date.Day;
        if (yearDIFF < 0)
            yearDIFF = -yearDIFF;
        if (monthDIFF < 0)
            monthDIFF = -monthDIFF;
        if (dayDIFF < 0)
            dayDIFF = -dayDIFF;
        int result = yearDIFF * 365 + monthDIFF * 30 + dayDIFF;

        return result + " days";
    }

    public static int compare(CustomDate date1, CustomDate date2) {
        int result1 = date1.Year * 365 + date1.Month * 30 + date1.Day;
        int result2 = date2.Year * 365 + date2.Month * 30 + date2.Day;
        if (result1 < result2) {
            return 1;
        } else if (result1 > result2) {
            return -1;
        } else {
            return 0;
        }
    }

    public String displayFormatted() {
        String Month = "";
        switch (this.Month) {
            case 1:
                Month = "Jan";
                break;
            case 2:
                Month = "Feb";
                break;
            case 3:
                Month = "Mar";
                break;
            case 4:
                Month = "Apr";
                break;
            case 5:
                Month = "May";
                break;
            case 6:
                Month = "Jun";
                break;
            case 7:
                Month = "Jul";
                break;
            case 8:
                Month = "Aug";
                break;
            case 9:
                Month = "Sep";
                break;
            case 10:
                Month = "Oct";
                break;
            case 11:
                Month = "Nov";
                break;
            case 12:
                Month = "Dec";
                break;
        }
        return this.Day + " " + Month + " " + this.Year;
    }

    public String String() {
        return "CustomDate [Month=" + Month + ", Day=" + Day + ", Year=" + Year + "]";
    }
}
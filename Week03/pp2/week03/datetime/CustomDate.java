package pp2.week03.datetime;

public class CustomDate {
    private int M; // Month
    private int D; // Day
    private int Y; // Year

    public CustomDate(int M, int D, int Y) {
        this.M = M;
        this.D = D;
        this.Y = Y;
    }

    public int getMonth() {
        return M;
    }

    public int getDay() {
        return D;
    }

    public int getYear() {
        return Y;
    }

    public void setMonth(int M) {
        this.M = M;
    }

    public void setDay(int D) {
        this.D = D;
    }

    public void setYear(int Y) {
        this.Y = Y;
    }

    public String displayDate() {
        return this.M + "/" + this.D + "/" + this.Y;
    }

    public String DIFF(CustomDate date) // DIFF = difference of date
    {
        int yearDIFF = this.Y - date.Y;
        int monthDIFF = this.M - date.M;
        int dayDIFF = this.D - date.D;
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
        int result1 = date1.Y * 365 + date1.M * 30 + date1.D;
        int result2 = date2.Y * 365 + date2.M * 30 + date2.D;
        if (result1 < result2) {
            return 1;
        } else if (result1 > result2) {
            return -1;
        } else {
            return 0;
        }
    }

    public String displayFormatted() {
        String M = "";
        switch (this.M) {
            case 1:
                M = "Jan";
                break;
            case 2:
                M = "Feb";
                break;
            case 3:
                M = "Mar";
                break;
            case 4:
                M = "Apr";
                break;
            case 5:
                M = "May";
                break;
            case 6:
                M = "Jun";
                break;
            case 7:
                M = "Jul";
                break;
            case 8:
                M = "Aug";
                break;
            case 9:
                M = "Sep";
                break;
            case 10:
                M = "Oct";
                break;
            case 11:
                M = "Nov";
                break;
            case 12:
                M = "Dec";
                break;
        }
        return this.D + " " + M + " " + this.Y;
    }

    public String String() {
        return "CustomDate [M=" + M + ", D=" + D + ", Y=" + Y + "]";
    }
}
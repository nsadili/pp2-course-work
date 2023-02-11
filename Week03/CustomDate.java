public class CustomDate {
    private int month;
    private int date;
    private int year;

    public CustomDate() {
        month=4;
        date=25;
        year=2022;
    }

    public CustomDate(int month,int date,int year) {
        this.month=month;
        this.date=date;
        this.year=year;
    }

    public void setMonth(int month) {
        this.month=month;
    }

    public void setDate(int date) {
        this.date=date;
    }

    public void setYear(int year) {
        this.year=year;
    }

    public int getMonth() {
        return month;
    }

    public int getDate() {
        return date;
    }


    public int getYear() {
        return year;
    }

    public String DisplayDate() {
        return (this.month + "/" + this.date + "/" + this.year);
    }

     public int difference(CustomDate date) {
         return (Math.abs(this.date-date.date));
     } // could not understand


}

class CustomDate {
    private int month;
    private int day;
    private int year;

    public CustomDate(int day,int month,int year) {
        if(month==12) {
            if(day>31) System.out.print("ERROR");
        }
        else if(month==2) {
            if(year%4==0) {
                if(day>29) System.out.print("ERROR");
            } 
            else if(day>28) System.out.print("ERROR");
        }
        else if(month%2==0) {
            if(day>30) System.out.print("ERROR");
        }
        else if(month%2!=0) {
            if(day>31) System.out.print("ERROR");
        } 
         this.day=day;

        if(month>12) System.out.print("ERROR");
        else this.month=month;

        this.year=year;
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day=day;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month=month;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year=year;
    }

    public void DisplayDate() {
        System.out.printf("%02d/%02d/%04d\n",this.month,this.day,this.year);
    }

    public void difference(CustomDate date) {
        int dif=this.day-date.getDay();
        if(dif<0) System.out.printf("%d\n",dif*(-1));
        else System.out.printf("%d\n",dif);
    }

    public void compare(CustomDate date1,CustomDate date2) {
        
        if(date1.year>date2.year) System.out.print("1\n");
        else if(date2.year>date1.year) System.out.print("-1\n");

        else {
            if(date1.month>date2.month) System.out.print("1\n");
            else if(date2.month>date1.month) System.out.print("-1\n");
            
            else {
                if(date1.day>date2.day) System.out.print("1\n");
                else if(date2.day>date1.day) System.out.print("-1\n");
                else System.out.print("0\n");
            }
        }
    }

    public void displayFormatted() {
        String monthString;
        switch(this.month) {
            case 1: monthString="Jan";
            break;

            case 2: monthString="Feb";
            break;

            case 3: monthString="Mar";
            break;

            case 4: monthString="Apr";
            break;

            case 5: monthString="May";
            break;

            case 6: monthString="Jun";
            break;

            case 7: monthString="Jul";
            break;

            case 8: monthString="Aug";
            break;

            case 9: monthString="Sep";
            break;

            case 10: monthString="Oct";
            break;

            case 11: monthString="Nov";
            break;

            default: monthString="Dec";
            break;
        }

        System.out.printf("%d %s %04d",this.day,monthString,this.year);
    }
}
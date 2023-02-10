public class CustomDate{
    private int day,month,year;
    String[][] months = {{"january","31"},{"february","28"},{"march","31"},{"april","30"},{"may","31"},{"june","30"},{"jule","31"},{"august","31"},{"september","30"},{"october","31"},{"november","30"},{"december","31"}};

    CustomDate(int day, int month, int year){
        if((month <= 12 && day <= Integer.parseInt(months[month-1][1])) || (year%4 ==0 && month == 2 && day<=29)){
            this.month = month;
            this.day = day;
            this.year = year;
        }else{
            System.out.println("Incorrect Input");
        }
        
    }

    int getDay(){
        return this.day;
    }
    int getMonth(){
        return this.month;
    }
    int getYear(){
        return this.year;
    }
    void setDay(int day){
        if((day< Integer.parseInt(months[month-1][1])) || (this.year%4==0 && this.month ==2 && day==29)){
            this.day = day;
        }else{
            System.out.println("Incorrect Input");
        }
    }
    void setMonth(int month){
        if(month <=12){
            this.month = month;
        }else{
            System.out.println("Incorrect Input");
        }
    }
    void setYear(int year){
        this.year = year;
    }

    void displayDate(){
        System.out.printf("%02d/%02/%d",day,month,year);
    }

    int difference(CustomDate date){
        int yearDiff = date.year - this.year;
        int monthDiff = date.month - this.month;
        int dayDiff = date.day - this.day;
        int resDiffWithDays = yearDiff*365 + monthDiff*30 + dayDiff;
        if(resDiffWithDays < 0)
            resDiffWithDays = -resDiffWithDays;
        
        return resDiffWithDays;
    }

    static int compare(CustomDate date1, CustomDate date2){
        if(date1.year <= date2.year){
            if(date1.year == date2.year && date1.month <= date2.month){
                if(date1.month == date2.month && date1.day <= date2.day){
                    if(date1.day == date2.day){
                        return 0;
                    }else{
                        return 1;
                    }
                }else{
                    return -1;
                }
            }else{
                return -1;
            }
        }else{
            return -1;
        }
    }

    void displayFormatted(){
        System.out.printf("%d %s %d",this.day, this.months[this.month-1], this.year);
    }

}
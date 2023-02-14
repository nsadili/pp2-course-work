package Week03.datetime;

public class CustomDate {
    private int month;
    private int day;
    private int year;

    public CustomDate(int month, int day, int year){
        if(month>=1 && month <=12){
            this.month=month;
        }else{
            System.out.println("Invalid month!");
        }
        if(day>=1 && day<=31){
            this.day= day;
        } else{
            System.out.println("Invalid day!");
        }
        if(year >=1){
            this.year= year;
        } else {
            System.out.println("Invalid year!");
        }
        if ((month == 2 && day > 29) || 
        (month == 2 && day == 29 && !isLeapYear(year)) || 
        (month == 4 || month == 6 || month == 9 || month == 11) && day == 31) {
            System.out.println("Invalid date. We do not have such date in our calendar!");
        }
    }

       public boolean isLeapYear(int year){
        if (year %400==0 || (year%4==0 && year %100 !=0)){
            return true;

        }
       
          return false;
    }
    public int getMonth(){
        return month;
    }
    public void setMonth(int month){
        if(month>=1 && month <=12){
            this.month= month;
        }
         else{
            System.out.println("Invalid data!");
         }
    }
    public int getDay(){
      return day;
        
    }
    public void setDay(int day){
        if(day>=1 && day<=31){
            this.day = day;
        }
         else{
            System.out.println("Invalid data!");
         }
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year){
        if(year >=1) {
            this.year= year;
        } else{
            System.out.println("Invalid data!");
        }
       
        
    }
    public void displayDate(){
        System.out.println(month + "/" +day + "/" +year);
    }

    public static int compare(CustomDate date1, CustomDate date2){
        if(date1.year < date2.year){
            return 1;
        } else if (date1.year>date2.year){
            return -1;
        } else if(date1.month<date2.month){
            return 1;
        } else if(date1.month>date2.month){
            return -1;
        } else if(date1.day <date2.day){
            return 1;
        }else if(date1.day >date2.day){
            return -1;
        }else{
            return 0;
       
            
      }

}
public void displayFormatted(){
    String formattedMonth= "";
    switch (month){
        case 1:
        formattedMonth= "Jan";
        break;
        case 2:
        formattedMonth= "Feb";
        break;
        case 3:
        formattedMonth= "Mar";
        break;
        case 4:
        formattedMonth= "Apr";
        break;
        case 5:
        formattedMonth= "May";
        break; 
        case 6:
        formattedMonth= "Jun";
        break;
        case 7:
        formattedMonth= "Jul";
        break;
        case 8:
        formattedMonth= "Aug";
        break;
        case 9:
        formattedMonth= "Sep";
        break;
        case 10:
        formattedMonth= "Oct";
        break;
        case 11:
        formattedMonth= "Nov";
        break;
        case 12:
        formattedMonth= "Dec";
        break;
        default:
        System.out.println("Invalid data!");
    }
System.out.println(day +" "+ formattedMonth + " "+year);
    }
    public int difference(CustomDate date){
        int daysInThisDate= year*365+day;
        int daysInInputDate = date.year*365 +date.day;
        return Math.abs(daysInThisDate - daysInInputDate);

    }

}

package pp2.week03.datetime;
import java.lang.Math;
import java.util.Scanner;
public class  CustomDate {
    private int day;
    private int month;
    private int year;
    private int flag=0;
    private int day_cnt=0;

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public int getDay_cnt() {
        return day_cnt;
    }

    public void setDay_cnt(int day_cnt) {
        this.day_cnt = day_cnt;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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

    public CustomDate(int day, int month, int year){
        if(year%4==0)
            if(year%400!=0 && year%100==0)flag=0;
            else flag=1;
        else flag=0;
        if(day>31 || day<1 || month>12|| month<1 || year<1){System.out.print("Not valid input"); flag=1;}
        else if((month==1 && day<=31) || (month==2 && day<=29 && flag==1) || (month==2 && day<=28 && flag==0)
        || (month==3 && day<=31)|| (month==4 && day<=30 )|| (month==5 && day<=31 )|| (month==6 && day<=30 )
                || (month==7 && day<=31 )|| (month==8 && day<=31 )|| (month==9 && day<=30 )|| (month==10 && day<=31)
                || (month==11 && day<=30 )|| (month==12 && day<=31 )) {setDay(day); setMonth(month); setYear(year);}
    }
    public void displayDate(){System.out.println(day+"/"+month+"/"+year);}
    public int difference(CustomDate date){
        for(int j=1; j<=year;j++) {
            if(j%4==0)
                if(j%400!=0 && j%100==0)flag=0;
                else flag=1;
            else flag=0;
            for (int i = 1; i <= month; i++) {
                switch (i) {
                    case 1, 3, 5, 7, 8, 10, 12:
                        day_cnt += 31;
                    case 2:
                        if(flag==0)day_cnt+=28;else day_cnt+=29;
                    case 4,6,9,11:
                        day_cnt += 30;
                }
            }
        }
        for(int j=1; j<=date.getYear();j++) {
            if(j%4==0)
                if(j%400!=0 && j%100==0)flag=0;
                else flag=1;
            else flag=0;
            for (int i = 1; i <= date.getMonth(); i++) {
                switch (i) {
                    case 1, 3, 5, 7, 8, 10, 12:
                        date.setDay_cnt(date.getDay_cnt()+31);
                    case 2:
                        if(flag==0)date.setDay_cnt(date.getDay_cnt()+28);else date.setDay_cnt(date.getDay_cnt()+29);
                    case 4,6,9,11:
                        date.setDay_cnt(date.getDay_cnt()+30);
                }
            }
        }
        return day_cnt- date.getDay_cnt();
    }
    public static int compare(CustomDate date1, CustomDate date2){
        int diff=date1.difference(date2);
        if(diff>0)return 1;
        else if(diff<0)return -1;
        else return 0;
    }
    public void displayFormatted(){
        System.out.print(day+" ");
        String month_pr = "";
        switch (getMonth()){
            case 1:month_pr="January";
            case 2:month_pr="February";
            case 3:month_pr="March";
            case 4:month_pr="April";
            case 5:month_pr="May";
            case 6:month_pr="June";
            case 7:month_pr="July";
            case 8:month_pr="August";
            case 9:month_pr="September";
            case 10:month_pr="October";
            case 11:month_pr="November";
            case 12:month_pr="December";
        }
        System.out.print(month_pr+" "+year);
    }
}
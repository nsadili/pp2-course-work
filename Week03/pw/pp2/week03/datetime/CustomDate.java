package pp2.week03.datetime;


public class CustomDate {

    private int month;
    private int day;
    private int year;

    public CustomDate(int day, int month, int year){
        
        if ((day<=31 && (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12))||
        (day<=30 && (month==4||month==6||month==9||month==11))||
        (day<=28 && month==2 && year%4!=0)||
        (day<=29 && month==2 && year%2==0)){
            this.day=day;
            this.month=month;
            this.year=year;
        } else {
            System.out.println("ERROR!!!");
            System.exit(year);
        }
    }
    public String displayDate(){ //displaying the date
        return this.day + "/" + this.month + "/" + this.year;
    }


    public long CDWeHave;
    public long CDAdded;
    public long difference(CustomDate date){ //there can be some difference
        if ((month==1||month==3||month==5||month==7||month==8||month==10||month==12)&&year%4==0)
        {
            CDWeHave = this.day+this.month*31+this.year*366;
            CDAdded = date.day+date.month*31+date.year*366;
        }
        if ((month==1||month==3||month==5||month==7||month==8||month==10||month==12)&&year%4!=0)
        {
            CDWeHave = this.day+this.month*31+this.year*365;
            CDAdded = date.day+date.month*31+date.year*365;
        }

        if ((month==4||month==6||month==9||month==11)&&year%4==0)
        {
            CDWeHave = this.day+this.month*30+this.year*366;
            CDAdded = date.day+date.month*30+date.year*366;
        }
        if ((month==4||month==6||month==9||month==11)&&year%4!=0)
        {
            CDWeHave = this.day+this.month*30+this.year*365;
            CDAdded = date.day+date.month*30+date.year*365;
        }

        if ((month==2)&&year%4==0)
        {
            CDWeHave = this.day+this.month*29+this.year*366;
            CDAdded = date.day+date.month*29+date.year*366;
        }
        if ((month==2)&&year%4!=0)
        {
            CDWeHave = this.day+this.month*28+this.year*365;
            CDAdded = date.day+date.month*28+date.year*365;
        }
        return (long) Math.abs(CDAdded-CDWeHave);
        
    }
    long A;
    long B; 
        public String compare(CustomDate date1,CustomDate date2){ //WHAT IS THE PROBLEM???????
            if ((month==1||month==3||month==5||month==7||month==8||month==10||month==12)&&year%4==0)
        {
            A= date1.day+date1.month*31+date1.year*366;
            B= date2.day+date2.month*31+date2.year*366;
        }
        if ((month==1||month==3||month==5||month==7||month==8||month==10||month==12)&&year%4!=0)
        {
            A= date1.day+date1.month*31+date1.year*365;
            B= date2.day+date2.month*31+date2.year*365;
        }

        if ((month==4||month==6||month==9||month==11)&&year%4==0)
        {
            A= date1.day+date1.month*30+date1.year*366;
            B = date2.day+date2.month*30+date2.year*366;
        }
        if ((month==4||month==6||month==9||month==11)&&year%4!=0)
        {
            A = date1.day+date1.month*30+date1.year*365;
            B = date2.day+date2.month*30+date2.year*365;
        }

        if ((month==2)&&year%4==0)
        {
            A = date1.day+date1.month*29+date1.year*366;
            B = date2.day+date2.month*29+date2.year*366;
        }
        if ((month==2)&&year%4!=0)
        {
            A = date1.day+date1.month*28+date1.year*365;
            B = date2.day+date2.month*28+date2.year*365;
        }
        if (A>B) return "-1";
        if (A<B) return "1";
        if (A==B) return "0";
        return null;
    }


    public String displayFormatted(){ //Displaying Date with words
        if (month==1) return this.day + " Jan " + this.year;
        if (month==2) return this.day + " Feb " + this.year;
        if (month==3) return this.day + " Mar " + this.year;
        if (month==4) return this.day + " Apr " + this.year;
        if (month==5) return this.day + " May " + this.year;
        if (month==6) return this.day + " Jun " + this.year;
        if (month==7) return this.day + " Jul " + this.year;
        if (month==8) return this.day + " Aug " + this.year;
        if (month==9) return this.day + " Sep " + this.year;
        if (month==10) return this.day + " Oct " + this.year;
        if (month==11) return this.day + " Nov " + this.year;
        if (month==12) return this.day + " Dec " + this.year;

        return null;
    }
    public int getDay(){ // GETTERS
        return this.day;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }

    public void setDay(int day){ //SETTERS
        this.day=day;
    }
    public void setMonth(int month){
        this.month=month;
    }
    public void setYear(int year){
        this.year=year;
    }
}
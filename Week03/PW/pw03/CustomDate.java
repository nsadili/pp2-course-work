public class CustomDate {
    int month;
    int day;
    int year;
    String mo;
    CustomDate(int month,int day,int year){
        this.month=month;
        this.day=day;
        this.year=year;

    }
    public void setMonth(int month){
       if(month<=12 & month>0)  this.month=month; else this.month=0;
    }
    public int getMonth(){
         return this.month;
    }
    public void setDay(int day){
        if(day<=31 & day>0) this.day=day; else this.day=0;
    }
    public int getDay(){   
        return this.day;
    }
    public void setYear(int year){
        if(year<2024 && year>=0) this.year=year; else this.year=0;
    }

    public int getYaer(){
       return this.year;

    }
    public void displayDate(){
        System.out.println(this.month+"/"+this.day+"/"+this.year);
    
    }

   public int difference(CustomDate date){
    
    return this.getDay()-date.getDay();
   
}

   public static void compare(CustomDate date1, CustomDate date2){
        if(date1.getDay()<date2.getDay()) System.out.println(1);else
        if(date1.getDay()>date2.getDay()) System.out.println(-1); else System.out.println(0);
   }
   public void displayFormatted(){
    switch(this.getMonth()){
        case 1:this.mo="Jan";
        break;
        case 2:this.mo="Feb";
        break;
        case 3:this.mo="Mar";
        break;
        case 4:this.mo="Apr";
        break;
        case 5:this.mo="May";
        break;
        case 6:this.mo="Jun";
        break;
        case 7:this.mo="Jul";
        break;
        case 8:this.mo="Aug";
        break;
        case 9:this.mo="Sep";
        break;
        case 10:this.mo="Oct";
        break;
        case 11:this.mo="Nov";
        break;
        case 12:this.mo="Dec";
        break;
    }
    System.out.printf("%d %s %d",this.getDay(),this.mo,this.getYaer());
   }
   

   }


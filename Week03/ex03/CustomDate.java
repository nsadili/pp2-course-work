import java.time.LocalDate;  //Java package that gives current date
import java.time.temporal.ChronoUnit; // Java package that calculates date difference in terms of days

public class CustomDate
{
    private int month;
    private int day;
    private int year;
    private LocalDate customDate;

    private static boolean isLeapYear(int year)
    {
        if(year % 400 == 0 || (year % 4 == 0))
        {
            return true;
        }

        return false;
    }


    public CustomDate(int month, int day , int year)
    {
        // the input validation checkers below

        if(month < 1 || month > 12)
        {
            throw new IllegalArgumentException("Invalid input. Choose month number between 1-12");
            //this is for throwing exception when there is runtime errors
        }

        if(day < 1 || day > 31)
        {
            throw new IllegalArgumentException("Invalid input. Choose day number between 1-31");           
        }

        if(year < 1)
        {
            throw new IllegalArgumentException("Invalid input. Year must be natural number.");
        }

        // considering leap year - below
        if(month == 2)
        {
            if(isLeapYear(year))
            {
                if(day > 29)
                {
                    throw new IllegalArgumentException("February in leap year must be between 1-29");
                }
            }
            else
            {
                if(day>28)
                {
                    throw new IllegalArgumentException("February in non-leap year must be between 1-28");
                }
            }
        }

        this.month = month;
        this.day = day;
        this.year = year;
        this.customDate = LocalDate.of(year, month, day);
    }

  

    public int getMonth()
    {
        return month;
    }

    public void setMonth(int month)
    {
        this.month = month;
        this.customDate = LocalDate.of(year, month, day);
    }

    public int getDay()
    {
        return day;
    }

    public void setDay(int day)
    {
        this.day = day;
        this.customDate = LocalDate.of(year, month, day);
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int day)
    {
        this.year = year;
        this.customDate = LocalDate.of(year, month, day);
    }

    // METHODS

    public void displayDate()
    {
        System.out.println(month + "/" + day + "/" + year);
    }

    // public long difference(CustomDate date)
    // {
    //     // this is accurate form
    //     LocalDate currentDate = LocalDate.now();  //gives current date
    //     LocalDate inputDate = LocalDate.of(date.year, date.month, date.day);
    //     return ChronoUnit.DAYS.between(inputDate, currentDate);  // it calculates difference 


    //     // Calendar current = Calendar.getInstance(); //this method is included in calendar package of Java 
    //     // long currentDate = current.get(Calendar.YEAR)*365 + current.get(Calendar.MONTH + 1) * 30 + current.get(Calendar.DATE);     
    //     // // get(Calendar.MONTH) is zero-based ,so january will be printed as 0. so we should add 1   
    //     // long customDate = date.year * 365 + date.month * 30 + date.day;
    //     // // it may not be accurate 
    //     // System.out.printf("Difference between current date and given one : %d", currentDate - customDate );
    // }

    public static int compare(CustomDate date1, CustomDate date2)
    {
        if (date1.getYear() < date2.getYear())
        {
            return 1;
        }
        else if(date1.getYear() > date2.getYear())
        {
            return -1;
        }
        else //if years equal
        {
            if(date1.getMonth() < date2.getMonth())
            {
                return 1;
            }
            else if(date1.getMonth() > date2.getMonth())
            {
                return -1;
            }
            else // if months equal
            {
                if(date1.getDay() > date2.getDay())
                {
                    return 1;
                }
                else if(date1.getDay() > date2.getDay())
                {
                    return -1;
                }
                else //days equal
                {
                    return 0;
                }
            
            }
        }
    
    }

   


    public static void displayFormatted(CustomDate date1)
    {
         int day = date1.getDay();
         int year = date1.getYear();

        if(date1.getMonth()==1)
        {
            System.out.println(day + "/" + "january" + "/" + year);
        }
        else if(date1.getMonth()==2)
        {
            System.out.println(day + "/" + "February" + "/" + year);
        }
        else if(date1.getMonth()==3)
        {
            System.out.println(day + "/" + "March" + "/" + year);
        }
        else if(date1.getMonth()==4)
        {
            System.out.println(day + "/" + "April" + "/" + year);
        }
        else if(date1.getMonth()==5)
        {
            System.out.println(day + "/" + "May" + "/" + year);
        }
        else if(date1.getMonth()==6)
        {
            System.out.println(day + "/" + "June" + "/" + year);
        }
        else if(date1.getMonth()==7)
        {
            System.out.println(day + "/" + "July" + "/" + year);
        }
        else if(date1.getMonth()==8)
        {
            System.out.println(day + "/" + "August" + "/" + year);
        }
        else if(date1.getMonth()==9)
        {
            System.out.println(day + "/" + "September" + "/" + year);
        }
        else if(date1.getMonth()==10)
        {
            System.out.println(day + "/" + "October" + "/" + year);
        }
        else if(date1.getMonth()==11)
        {
            System.out.println(day + "/" + "November" + "/" + year);
        }
        else if(date1.getMonth()==12)
        {
            System.out.println(day + "/" + "December" + "/" + year);
        }

    }

}







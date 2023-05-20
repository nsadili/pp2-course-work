package Week03.DateTime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class CustomDate {
    private int month;
    private int day;
    private int year;

    public CustomDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // b. Provide a set and a get method for each instance variable.
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    // c. Provide a method displayDate() that displays the month, day and year separated by forward slashes (/).
    public void displayDate() {
        String formattedDate = String.format("%d/ %d %d", month, day, year);
        System.out.println(formattedDate);
    }

    // d. Provide a method difference(CustomDate date) which returns the difference
    public long difference(CustomDate date) {
        LocalDate thisDate = LocalDate.of(this.year, this.month, this.day);
        LocalDate otherDate = LocalDate.of(date.getYear(), date.getMonth(), date.getDay());
        return ChronoUnit.DAYS.between(thisDate, otherDate);
    }
    
     // i. Positive 1 if the date1 is earlier. ii. Negative 1 if the date2 is earlier.

        public static int compare(CustomDate date1, CustomDate date2) {
            if (date1.getYear() < date2.getYear()) {
                return 1;
            } else if (date1.getYear() > date2.getYear()) {
                return -1;
            } else //  0(Zero) if the dates are the same
                if (date1.getMonth() < date2.getMonth()) {
                    return 1;
                } else if (date1.getMonth() > date2.getMonth()) {
                    return -1;
                } else { //  0(Zero) if the dates are the same
                    if (date1.getDay() < date2.getDay()) {
                        return 1;
                    } else if (date1.getDay() > date2.getDay()) {
                        return -1;
                    } else { //  0(Zero) if the dates are the same
                        return 0;
                    }
                }
            }
        }
        //
        
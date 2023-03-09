public class CustomDate {
  private int month;
  private static int day;
  private int year;

  // constructor to initialize the instance variables
  public CustomDate(int month, int day, int year) {
    setMonth(month);
    setDay(day);
    setYear(year);
  }

  // set and get methods for the instance variables
  public void setMonth(int month) {
    if (month >= 1 && month <= 12) {
      this.month = month;
    } else {
      System.out.println("Invalid month input. Month should be between 1 and 12.");
    }
  }

  public int getMonth() {
    return month;
  }

  public void setDay(int day) {
    if (day >= 1 && day <= 31) {
      this.day = day;
    } else {
      System.out.println("Invalid day input. Day should be between 1 and 31.");
    }
  }

  public int getDay() {
    return day;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public int getYear() {
    return year;
  }

  // method to display the date as month/day/year
  public void displayDate() {
    System.out.println(month + "/" + day + "/" + year);
  }

  // method to calculate the difference between two dates in days
  public int difference(CustomDate date) {
    return day;
    // your code here to calculate the difference between two dates in days
  }

  // static method to compare two dates
  public static int compare(CustomDate date1, CustomDate date2) {
    return day;
    // your code here to compare two dates and return 1 if date1 is earlier, -1 if
    // date2 is earlier, or 0 if they are the same
  }

  // method to display the date in the format of month name day, year
  public void displayFormatted() {
    // your code here to display the date in the format of month name day, year
  }
}

class CustomDateTest {
  public static void main(String[] args) {
    CustomDate today = new CustomDate(2, 12, 2022);
    CustomDate tomorrow = new CustomDate(2, 13, 2022);

    System.out.println("Today's date: ");
    today.displayDate();
    System.out.println("Tomorrow's date: ");
    tomorrow.displayDate();

    System.out.println("\nDate comparison: " + CustomDate.compare(today, tomorrow));
    System.out.println("Date difference: " + today.difference(tomorrow) + " days");

    System.out.println("\nFormatted today's date: ");
    today.displayFormatted();
    System.out.println("Formatted tomorrow's date: ");
    tomorrow.displayFormatted();
  }
}

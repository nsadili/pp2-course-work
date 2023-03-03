package Week02.src;

import java.util.Scanner;

public class MonthInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MonthNumber = sc.nextInt();
        int NumOfDays = 0;
        String MonthName;
        if (MonthNumber == 1) {
            MonthName = "January: ";
            NumOfDays = 31;
        } else if (MonthNumber == 2) {
            MonthName = "February: ";
            NumOfDays = 28;
        } else if (MonthNumber == 3) {
            MonthName = "March: ";
            NumOfDays = 31;
        } else if (MonthNumber == 4) {
            MonthName = "April: ";
            NumOfDays = 30;
        } else if (MonthNumber == 5) {
            MonthName = "May: ";
            NumOfDays = 31;
        } else if (MonthNumber == 6) {
            MonthName = "June: ";
            NumOfDays = 30;
        } else if (MonthNumber == 7) {
            MonthName = "July: ";
            NumOfDays = 31;
        } else if (MonthNumber == 8) {
            MonthName = "August: ";
            NumOfDays = 31;
        } else if (MonthNumber == 9) {
            MonthName = "September: ";
            NumOfDays = 30;
        } else if (MonthNumber == 10) {
            MonthName = "October: ";
            NumOfDays = 31;
        } else if (MonthNumber == 11) {
            MonthName = "November: ";
            NumOfDays = 30;
        } else if (MonthNumber == 12) {
            MonthName = "December: ";
            NumOfDays = 31;
        } else {
            MonthName = "Invalid month name: ";
        }
        System.out.println(MonthName + "" + NumOfDays + " days");
    }
}
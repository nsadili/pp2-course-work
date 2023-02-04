package Moderate;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int cnt = 0;
        int sum = 0;
        int product = 1;
        double average = 0;

        if (number < 0){
            number = number * (-1);
        }

        while (number > 0) {

            int remainder = number % 10;
            sum += remainder;
            product *= remainder;
            number = number / 10;
            cnt ++;
        }
        average = (double) product / cnt;
        System.out.println(sum + ", " + product + ", " + average);
        scn.close();
    }

}

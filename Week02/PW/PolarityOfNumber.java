package PW;

import java.util.Scanner;

public class PolarityOfNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        var variable = input.nextInt();

        if (variable < 0) {
            System.out.println("Polarity Of Number is negative!");
        }
        if (variable > 0) {
            System.out.println("Polarity Of Number is positive!");
        }
        if (variable == 0) {
            System.out.println("Polarity Of Number is neutral!");
        }
    }
}
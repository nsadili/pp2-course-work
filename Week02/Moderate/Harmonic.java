package Moderate;

import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        double result = 0.0;

        for (int i = 1; i <= n; i++) {
            result += (double) 1 / i;
        }
        System.out.println(result);
        scn.close();
    }
}
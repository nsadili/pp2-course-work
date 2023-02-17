package Week04;

import java.util.Scanner;

public class Avarage {
    public static void main(String[] args) {
        int [] test = new int[10];
    try (Scanner scn = new Scanner(System.in)) {
        int sum = 0;
        int cnt = 0;
        for (int i=0; i<test.length;i++)
        {
            test[i]=scn.nextInt();
             sum += test[i];
             cnt++;
        }
        double ave= 1.0* sum/cnt;
        System.out.println(ave);
    }
    }    
}


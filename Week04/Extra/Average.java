package Week04.Extra;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int [] array = new int[10] ;
        double sum = 0; 
        int cnt = 0;
        double average;
        for(int i = 0 ; i < array.length ; i++){
            array[i] = scn.nextInt() ; 
            sum += array[i] ; 
            cnt++;
        }
        average = sum / cnt ; 
        System.out.println(average);
    }
}

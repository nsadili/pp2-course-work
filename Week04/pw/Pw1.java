package Week04.pw;

import java.util.Scanner;

public class Pw1 {
    
    public static void main(String[] args) {
        
        int min = 1000;
        int max = 0;

        Scanner scan = new Scanner(System.in);
        int var = scan.nextInt();


          private static StringMin(String str) {

            for (int i = 0; i < str.length - 1; i++) {
                if(str[i] < min)
                min = str[i];
            }

                return min;
        }
          
          
        private static StringMax(String str) {

            for (int i = 0; i < str.length - 1; i++) {
                if(str[i] > max) 
                max = str[i];
            
            }
                return max;

        }

        System.out.println(min);
        System.out.println(max);



    }
}
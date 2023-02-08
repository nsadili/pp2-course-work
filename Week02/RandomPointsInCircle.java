package Week2;

import java.util.Scanner;

public class RandomPointsInCircle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<1){
            System.out.println("Please enter a positive number next time.");
            System.exit(0);
        }

        
        double x;
        double y;

        for(int i=0; i<n; i++){
            do{
                x = Math.random();
                y = Math.random();
            }while(x*x+y*y > 1);
            System.out.printf("%f, %f are points on the circle.", x, y);
            System.out.println();
        }

        
        sc.close();
    }
}

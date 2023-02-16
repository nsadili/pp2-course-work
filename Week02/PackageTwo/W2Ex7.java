package PackageTwo;

import java.util.Scanner;

public class W2Ex7 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int x = sc.nextInt();
        sc.close();

        if(x < 0) System.out.println("Error.");
        else
        if(x == 0) System.out.println("1");
        else 
        if(x > 0){ 
            int fact = 1;
            while(x > 1){
                fact *= x--; 
            }
            System.out.println(fact);
        }

    }    
}

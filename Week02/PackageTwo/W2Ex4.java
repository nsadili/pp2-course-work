package PackageTwo;

import java.util.Scanner;

public class W2Ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value: ");
        double x = sc.nextDouble();
        sc.nextLine();

        sc.close();

        if(x > 0) System.out.println("Positive");
        if(x < 0) System.out.println("Negative");
        if(x == 0) System.out.println("Neutral");
    }
}

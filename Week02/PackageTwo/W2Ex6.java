package PackageTwo;

import java.util.Scanner;

public class W2Ex6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year: ");
        int x = sc.nextInt();

        if(x % 4 == 0) System.out.println("Yes");
        else System.out.println("No");

        sc.close();
    }
}
package PackageTwo;

import java.util.Scanner;

class W2Ex1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Write first integer: ");
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Write second integer: ");
        int num2 = sc.nextInt();
        sc.nextLine();
        sc.close();
        int sum = num1 + num2;

        System.out.println("The sum is: " + sum);
    }
}
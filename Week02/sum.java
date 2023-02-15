package PPKESH;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("num1 > ");
        int firstNum = sc.nextInt();
        System.out.print("num2 > ");
        int secondNum = sc.nextInt();

        int sum = firstNum + secondNum;

        System.out.printf("Sum is: %d\n", sum);

    }
}

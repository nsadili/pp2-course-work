package Week02;

import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please add First number: ");
        int num1 = sc.nextInt();
        System.out.println("please add Second number: ");
        int num2 = sc.nextInt();
        System.out.println("the answer  is: " + (num1 + num2));
    }
}
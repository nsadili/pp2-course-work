package Week02.ex;

import java.util.Scanner;

public class Sum{
    public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
		System.out.print("Enter the first numbers: ");
		var num1 = sc.nextInt();
		System.out.print("Enter the second numbers: ");
		var num2 = sc.nextInt();

		var Sum = num1 + num2;

		System.out.println("The sum of " + num1 + " and " + num2 + " is " + Sum + ".");
	};
	
    }
}

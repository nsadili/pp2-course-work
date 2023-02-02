import java.util.Scanner;

public class Sum{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in); // System.in is stdio.h

        System.out.println("Enter the first number");
        int a = input.nextInt();

        System.out.println("Enter the second number");
        var b = input.nextInt(); // returns int
        var sum = a + b;

        System.out.println(sum);
     }
}
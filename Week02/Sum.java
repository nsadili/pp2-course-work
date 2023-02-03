import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        var a=input.nextInt();
        var b=input.nextInt();
        var sum=a+b;
        System.out.println("The sum is: " + sum);
    }
}
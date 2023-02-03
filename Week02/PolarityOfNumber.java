import java.util.Scanner;

public class PolarityOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        var a= input.nextFloat();
        if(a>0) System.out.println("It is positive!");
        if(a<0) System.out.println("It is neegative!");
        if(a==0) System.out.println("It is neutral!");
    }
}

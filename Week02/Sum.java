import java.util.Scanner;

public class Sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("num1 >");
        var num1 = sc.nextInt();
        System.out.print("num2 >");
        var num2 = sc.nextInt();
        var sum = num1+num2;
        System.out.printf("%d+%d=%d", num1, num2, sum);
    }
}
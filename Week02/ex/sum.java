import java.util.Scanner;

public class sum{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("enter 2 numbers:");
        int a = obj.nextInt();
        int b = obj.nextInt();
        var sum = a+b;
        System.out.print(a+"+"+b+"="+sum);
    }
}
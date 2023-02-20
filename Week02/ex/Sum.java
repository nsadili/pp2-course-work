import java.util.Scanner;

public class Sum {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("num1 > ");
        int a = sc.nextInt();
        System.out.print("num2 > ");
        var b = sc.nextInt();
        var sum = a + b;
        
        System.out.printf("%d + %d = %d\n", a, b, sum);
    }
}
    
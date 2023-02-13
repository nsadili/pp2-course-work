import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a= input.nextInt();
        int b= input.nextInt();

        System.out.printf("%d\n",a+b);
        System.out.printf("%d\n",a-b);
        System.out.printf("%d\n",a*b);
        System.out.printf("%d\n",a/b);
        System.out.printf("%d\n",a%b);
    }
}
import java.util.Scanner;

public class Sum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.printf("Enter 1.st number\n");

        int a=sc.nextInt();
        System.out.printf("Enter 2.nd number\n");
        int b=sc.nextInt();

        int sum=a+b;
        System.out.printf("%d + %d = %d", a,b,sum);

    }
}
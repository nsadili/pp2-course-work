import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
System.out.println("sum " + (a+b));
System.out.println("subs " + (a-b));
System.out.println("multp " + (a*b));
System.out.println("intdvs " + (a/b));
System.out.println("remdvs " + (a%b));
    }
}
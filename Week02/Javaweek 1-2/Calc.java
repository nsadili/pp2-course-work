import java.util.Scanner;
public class Calc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  int b = sc.nextInt();
        System.out.println("Sum: "+ a+b);
        System.out.println("Subst: "+ (a-b));
        System.out.println("Mult: "+ a*b);
        System.out.println("Div: "+ a/b);
        System.out.println("Rem: "+ a%b);
    }
}

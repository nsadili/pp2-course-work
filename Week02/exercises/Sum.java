import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Num 1 >");
        int a = sc.nextInt();
        System.out.println("Num 2 >");
        var b = sc.nextInt();
        var sum=a+b;
        System.out.print(sum);


    }
}
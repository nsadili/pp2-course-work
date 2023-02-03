import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Give 1st number: ");
        int a=input.nextInt();
        System.out.print("Give 2nd number: ");
        var b=input.nextInt();
        var sum=a+b;
        System.out.println("The result is "+sum);
    }
}

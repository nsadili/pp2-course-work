import java.util.Scanner;
public class Sum {

    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     var num1=sc.nextInt();
     var num2=sc.nextInt();
     var sum=num1+num2;
     System.out.printf("%d + %d = %d\n", num1, num2, sum);
    }
}
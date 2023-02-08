import java.util.Scanner;

public class SumOfOdd{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter first number ->");
        int a=sc.nextInt();
        System.out.print("Enter second number ->");
        int b=sc.nextInt();

        if(a>b){
            int x=a;
            a=b;
            b=x;
        }

        var sum=0;
        var i=0;
       if(a%2==0){
         i=++a;
       }else{
         i=a;
       }

        for(;i<=b;i+=2){
            sum+=i;
        }
        System.out.println("Sum is: "+sum);

    }
}
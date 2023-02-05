import java.util.Scanner;

public class SumOfOdd{
    public static void main(String[] args) throws Exception {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter first number:");
    int num1= sc.nextInt();
    System.out.println("Enter second number:");
    int num2= sc.nextInt();
    
    int min= Math.min(num1, num2);
    int max= Math.max(num1, num2);
    int sum=0;

    for(int i= min+1; i<max; i++){
        if(i % 2!= 0){
            sum += i;
        }
    }
    System.out.println("The sum of odd numbers: " + sum);
}
}

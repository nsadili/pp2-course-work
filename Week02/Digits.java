import java.util.Scanner;

public class Digits{
  public static void main(String[] args){

  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number: ");
  int num = sc.nextInt();

  int sum = 0;
  int product = 1;
  int count = 0;
  int copy = num;

  while(num != 0){
    int digit = num % 10;
    sum += digit;
    product *= digit;
    count ++;
    num /= 10;
  }
  System.out.println("Sum of the digits of " + copy + " : " + sum);
  System.out.println("Product of the digits of " + copy + " : " + product);
  System.out.println("Average of the digits of " + copy + " : " + (float) sum/count );

  }

}
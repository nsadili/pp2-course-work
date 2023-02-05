import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.Scanner;


public class Digits{
 public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);

 var number = sc.nextInt();
 var CopyNumber = number;

 if(number < 0){
    number = -number;
 }

 int digit, sum=0, count=0, product=1;

 while(number>0){
    digit = number % 10;

    sum += digit;
    count++;
    product *=digit;

    number /= 10;
 }

 var avg = CopyNumber != 0
            ? (double) sum/count
            : 0.0;
product = CopyNumber != 0
            ? product
            : 0;


 System.out.printf("Number = %d, Sum = %d , Product = %d, Avg = %.3f\n", CopyNumber, sum, product, avg);
 



}
}




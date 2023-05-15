
import java.util.Scanner;

public class Digits {

public static void main(String [] args ){

Scanner scan = new Scanner(System.in);
var number = scan.nextInt();
var copynumber=number;
if(number<0) number=-number;


// number=Math.abs(number);

int digit, sum=0, cnt=0, prod=1;
while(number>0){
    digit = number%10;

    sum+=digit;
    cnt++;
    prod *=digit;

    number/=10;
}
var avg =copynumber !=0 ? (double) sum /cnt :0.0;

prod = copynumber !=0 ? prod:0; 
 
 System.out.printf("Number= %d, Sum=%d, Product = %d, Avg = %.3f\n", 
 copynumber, sum, prod, avg);
}
}

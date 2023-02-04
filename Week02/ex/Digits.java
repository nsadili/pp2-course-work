import java.util.Scanner;
public class Digits{
public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    var a = scan.nextInt();
    var copy = a;
    var sum=0;
    var product=1;
    double avg;
    int num=0;
    if(a<0) a=-a;
    
    while (a>0)
    {
        sum+=a%10;
        product*=a%10;
        num++;
        a/=10;
    }
    if(copy==0) { 
        product=0; 
        avg=0;
     }
    else
avg= sum/num;
System.out.printf("Number:%d, Sum: %d, Product: %d, Average: %.3f",copy,sum,product,avg);



}

}
import java.util.Scanner;

public class Digits {

public static void main(String[] args) {
 

    Scanner sc=new Scanner(System.in);

    int a=sc.nextInt();
    var num=a;
    a=Math.abs(a);

    var sum=0;
    var product=1;
    var cnt=0;
    int dig;
  
    while(a>0){

         dig=a%10;

        sum+=dig;
        product*=dig;
        cnt++;
        a/=10;
    }

    var average= num!=0 ? (double) sum/ cnt : 0;

    product= num!=0 ? product : 0;

    System.out.printf("Number: %d, Sum: %d, Product: %d , Average: %f",num,sum,product,average);
}
    
}
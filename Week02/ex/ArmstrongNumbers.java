import java.util.Scanner;
public class ArmstrongNumbers{
public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    int a= scan.nextInt();
    int b= scan.nextInt();
    // Interval [a;b]
    int num;
  
    for(num =a; num<=b;num++){
        int digit=0;
        int result= 0;
        int num2= num;
        while (num2!=0){
            num2 /=10;
            digit++;

        }
        num2 =num;
        while(num2!=0){
            int remainder= num2%10;
            result+= Math.pow(remainder, digit);
            num2 /=10;
        }
        if(result==num){
            System.out.println(num);
        }
    }
}
}
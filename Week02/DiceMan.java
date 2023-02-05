import java.util.Random;
import java.util.Scanner;

public class DiceMan {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        Random ran=new Random();
        while(true){
            System.out.println("Insert the number you want");  
            var n=scan.nextInt();
            if(n==0) break;
            if (n>12 || n<2) {System.out.println("ERROR!!!"); }
            else{
                var a= ran.nextInt(1,6);
                var b= ran.nextInt(1,6);
                var sum=a+b;
                if(a+b==n){System.out.println("You won :)"); }
                else {System.out.println("You lost :(, the number was"+sum); }
            }
        }
    }
}

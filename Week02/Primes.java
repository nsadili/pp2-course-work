import java.util.Scanner;

public class Primes {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        var a=scan.nextInt();
        var b= (double) Math.sqrt(a);
        var cnt=0;
        for(int i=2;i<=b;i++){
            if(a%i==0) cnt++;
        }
        if(cnt!=0) {System.out.println(a+" is not a prime number");}
        else {System.out.println(a+" is a prime number");}
    }
    
}

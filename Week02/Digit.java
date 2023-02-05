import java.util.Scanner;

public class Digit {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        var a= scan.nextInt();
        var sum=0;
        var n=0;
        var avr=(double) 0;
        var prod=1;
        var d=0;
        var a1=a;
        if(a<10){a*=-1;}
        while(a1!=0){
            d=a1%10;
            sum+=d;
            prod*=d;
            a1/=10;
            n++;
        }
        avr=sum/n;
        System.out.printf("Average= %f\nSum= %d\nProduct= %d",avr,sum,prod);
    }
}

import java.util.Scanner;

public class TaylorSin {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        var sin=(double) 0;
        var fact= 1;
        var n=scan.nextInt();
        var x=scan.nextDouble();
        for(int i=0;i<=n;i++){
            sin+= (double) Math.pow(1,i)*Math.pow(x,2*i+1)/fact;
            fact*=++fact;
            fact*=++fact;
        }
        System.out.println("sin("+x+")= "+sin);
    }
}
//Not sure
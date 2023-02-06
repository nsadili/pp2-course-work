import java.util.Scanner;

public class Taylorsin {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        double x = scan.nextDouble();
        double n = scan.nextDouble();
        double sum =x;
        double term;
        term=x;
        for (int i =2; i<(n+1)/2; i++)
        {
        if((i+1)%4==3) 
        term=term*(x*x/(i*(i+1))*(-1));
        if((i+1)%4==1)
        term=term*(x*x/(i*(i+1)));
        sum+=term;
        }
        

        double y= Math.sin(x);
        System.out.println("Math function:" +y);
        System.out.println("Taylor formula:" +sum);
    }
}


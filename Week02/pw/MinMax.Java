import java.util.Scanner;
public class MinMax{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double max= -1000000.0;
        double min =1000000.0;
        while (scan.hasNextDouble()){
            double n= scan.nextDouble();
            if(max<n){
                max=n;
            }
            if(n<min){
                min= n;

                
            }

        }
        System.out.println("The minimum is :" +min);
        System.out.println("The maximum is:" +max);
    }
}
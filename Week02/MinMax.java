import java.util.Scanner;

public class MinMax {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        while(scan.hasNextDouble()){
            var a=scan.nextDouble();
            if(min>a) min=a;
            if(max<a) max=a;
        }
        System.out.printf("Max= %f\nMin= %f",max,min);
    }
}

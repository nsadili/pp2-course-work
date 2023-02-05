import java.util.Random;
import java.util.Scanner;

public class RandomPointsInCircle {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        var n= scan.nextInt();
        double x,y;
        Random random= new Random();
        for(int i=0; i<n; i++){
            while(true){
                x= Math.random();
                y= Math.random();
                if(x*x+y*y<1) break;
            }
            System.out.printf("(%f;%f)\n",x,y);
        }
    }
}

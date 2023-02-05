import java.util.Scanner;

public class RandomPointsInCircle {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i=0; i<n; i++){
            double x = Math.random();
            double y = Math.random();
            if (x*x+y*y<=1) System.out.printf("point is (%f,%f)\n", x, y);
            else i--;
        }

        
    }
}

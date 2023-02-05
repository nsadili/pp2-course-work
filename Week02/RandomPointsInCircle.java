import java.util.Scanner;
import java.lang.Math;

public class RandomPointsInCircle {
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        double x, y;
        for(int i = 0; i < n; i++){
            x = Math.random();
            y = Math.random();
            System.out.println("point " + i + " with coordinates (" + x + "," + y + ")");
        }
    }
}

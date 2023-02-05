import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float min = 10000;
        float max = -10000;
        while (scn.hasNextFloat()) {
            float num = scn.nextFloat();
            if(num<min) min = num;
            if(num>max) max = num;
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args)
    {
        float min = Float.MAX_VALUE;
        float max = Float.MIN_VALUE;
        float num;
        Scanner scan = new Scanner (System.in);
        while (scan.hasNextFloat()) {
            num=scan.nextFloat();
            if (num>max)  max =num;
            if (num<min)  min =num;
} System.out.printf("MIN: %f \nMAX: %f",min,max);
    }
    
}

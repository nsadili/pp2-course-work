import java.util.Scanner;
public class MinMax{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int min = 10000000;
        int max = -100000000;
        while (scan.hasNextInt()){
            int m = scan.nextInt();
            if(m <= min) min = m;
            if(m >= max) max = m;
        }
        System.out.println("Min value is :" + min);
        System.out.println("Max value is :" + max);
    }
}
import java.util.*;
import java.lang.Math;
import java.util.Random;
public class MinMax {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            double min = Double.MAX_VALUE;
            double max = Double.MIN_VALUE;
            while (sc.hasNextDouble()) {
                double n = sc.nextDouble();
                if (min > n) {
                    min = n;
                }
                if (max < n) {
                    max = n;
                }
            }
            System.out.print("min: "+min+"\nmax: "+max);
        }
    }


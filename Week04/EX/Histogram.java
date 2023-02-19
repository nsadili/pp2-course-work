
import java.util.*;
public class Histogram {
    
    public static void main(String[] args) {
        int[] grades = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            grades[i] = Integer.parseInt(args[i]);
        }

        Arrays.sort(grades);
        double[] Stats = calculateStats(grades);

        for(double i: Stats){
            System.out.println(i);
        }
    }

    public static double[] calculateStats(int[] grades) {
        double[] stats = new double[3];
        int sum = 0;
        int n = grades.length;
        int mode = 0;
        int modeCount = 0;
    
        for (int i = 0; i < n; i++) {
            sum += grades[i];
        }
        double mean = (double) sum / n;
        stats[0] = mean;
    
        Arrays.sort(grades);
        if (n % 2 == 0) {
            double median = (double) (grades[n/2-1] + grades[n/2]) / 2;
            stats[1] = median;
        } else {
            double median = grades[n/2];
            stats[1] = median;
        }
    
        int i = 0;
        while (i < n) {
            int count = 0;
            for (int j = i; j < n; j++) {
                if (grades[j] == grades[i]) {
                    count++;
                }
            }
            if (count > modeCount) {
                modeCount = count;
                mode = grades[i];
            }
            i += count;
        }
        stats[2] = mode;
    
        return stats;
    }
}



import java.util.Arrays;

public class Histogram {
    public static void main(String[] args) {
        int[] grades = { 2, 5, 3, 7, 9, 2, 4, 4, 7, 0,0,0, 1, 3, 6, 10, 10, 10, 3 };//0 1 2 3 4
        double result[][] = MMM(grades);
        System.out.printf("Grades mean: %.2f\n",result[0][0]);
        System.out.printf("Grades median: %.0f\n", result[1][0]);
        for (int b=0;b<result[2].length;b++) {
            if(result[2][b]==0 && b!=0) continue;
            System.out.printf("Grades mode(s): %.0f\n", result[2][b]);
        }
    }

    static double[][] MMM(int[] grades) {
        double[][] result = new double[3][]; // mean, median, mode
        double[] mean = { 0 };
        for (int x : grades) {
            mean[0] += x;
        }
        mean[0] = mean[0] / grades.length;
        result[0] = mean;

        Arrays.sort(grades);
        double med[] = { grades.length % 2 == 1 ? grades[grades.length / 2] : (grades[grades.length / 2] + grades[grades.length / 2 - 1])/2};
        result[1] = med;

        //mode(s)
        double modes[] = new double[grades.length];
        int maxCount = 0;
        int lastNum=-1;
        for (int x : grades) {
            
            int count = 0;
            for (int y : grades) {
                if (x == lastNum && lastNum != -1)
                    break;
                if (y == x)
                    count++;
            }
            if(count == 0){continue;}
            //System.out.println("count"+count);
            lastNum = x;
            if (count > maxCount) {
                maxCount = count;
                modes = new double[grades.length];
                for (int b=0;b<modes.length;b++) {
                    if (grades[b] == lastNum) {
                        modes[0] = grades[b];
                        break;
                    }
                }
            } else if (count == maxCount) {
                for (int b=0;b<modes.length;b++) {
                    if (grades[b] == lastNum) {
                        int openSlot = 0;
                    for (int ii = 1; ii < modes.length; ii++) {
                        if(modes[ii] == 0) {
                            openSlot = ii;
                            break;
                        }}
                        modes[openSlot] = grades[b];
                        break;
                    }
                }
            }
        }
        
        
        result[2] = new double[modes.length];
        result[2] = modes;
        
        return result;
    }
}

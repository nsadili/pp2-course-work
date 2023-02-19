import java.util.Arrays;

public class Histogram {
    public static void main(String[] args) throws Exception {
        int[] grades = {5,3,6,8,3,6,5,3,5,7,4};
        Arrays.sort(grades);
        System.out.println("Mean, Median, Mode");
        Calc(grades);
    }
    
    public static void Calc(int[] grades) {
        double sum = 0;
        for(int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        double mean, median;
        int mode = -1, mostcnt = 0, cnt = 0, i, j;
        mean = sum / grades.length;
        median = grades[grades.length / 2];
        for(i = 0; i < grades.length; i++) {
            cnt = 0;
            for(j = 0; j < grades.length; j++) {
                if(grades[j] == grades[i]) {
                    cnt++;
                }
            }
            if(cnt > mostcnt) {
                mode = grades[i];
                mostcnt = cnt;
            }
        }
        double[] arr = {mean, median, mode};
        System.out.println(Arrays.toString(arr));
    }
}

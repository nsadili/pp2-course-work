import java.util.Arrays;
import java.util.Scanner;

public class Task3Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] grades = new int[n];
        int[] countOfStudentsWhoGot = new int[11];
        for(int i=0;i<n;i++) {
            grades[i] = scan.nextInt();
            countOfStudentsWhoGot[ grades[i] ] ++;
        }

        for(int i=0;i<11;i++) {
            System.out.println("Count of students who got " + i + " = " +
                    countOfStudentsWhoGot[i]);
        }

        System.out.println();

        int[] ans = f(grades);
        System.out.println(
                "mean: " + ans[0] + "\n" +
                "mode: " + ans[1] + "\n" +
                "median: " + ans[2]
        );
        scan.close();
    }

    public static int[] f(int[] arr) {
        int mean = 0;
        for(int i = 0; i < arr.length; i++) {
            mean += arr[i];
        }
        mean /= arr.length;

   // 3 5 4 5 7 5 8 7 9
        int mode = arr[0];
        int res = 1;
        int cnt = 1;
        
        for(int i = 0; i < arr.length; i++) {
            cnt = 0;

        for(int j = 0; j < arr.length; j++) {
            if(arr[i] == arr[j]) {
                cnt++;
                if(res < cnt) {
                    res = cnt;
                    mode = arr[i];
                }
            }
            else {
                cnt = 1;
            }
        }
    }

        int median = 0;

        Arrays.sort(arr);         //     |
        if(arr.length % 2 == 1) { // 1 2 3 4 5 => 3 = arr[2] => arr[5 / 2] 5 = arr.length
            median = arr[arr.length / 2];
        }                           //     | |
        if((arr.length) % 2 == 0) { // 1 2 3 3 4 5 => arr[2] and arr[3] => arr[6/2] arr[6/2-1]
            median = (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2;
        }

        int ans[] = {mean, mode, median};
        return ans;
    }
}

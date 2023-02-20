import java.util.*;
import java.lang.Math;
import java.util.Random;
public class maxFrequency {
    public class Main {
        public static void swap(int x, int y, int[] arr) {
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }


        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            int[] arr =new int[]{3, 4, 1, 2, 5};
            int temparr[]=new int[1000];
            int n,num=0;
            String a;
            int cnt=0,cnt_temp=0,cnt_arr=0,cnt_num=0;
            int maxcount = 0;
            int max_freq = 0;
            for(int i=0;i<arr.length;i++){
                for(int j=0; j<arr.length;j++) {
                    if (arr[i] < arr[j]) swap(j, i, arr);
                }
            }
            for(int i=0;i< arr.length;i++)System.out.print(arr[i]);
            for (int i = 0; i < arr.length; i++) {
                cnt=0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        cnt++;
                    }
                }

                if (cnt > maxcount) {
                    maxcount = cnt;
                    max_freq = arr[i];
                }
            }


            System.out.print(max_freq);

        }
    }
}

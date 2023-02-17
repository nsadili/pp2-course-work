import java.util.Arrays;
import java.util.Scanner;


public class Histogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int m=sc.nextInt();
        if (m <= 0) {
            System.out.println("Please enter a valid size for the array (greater than 0)!");
            System.exit(1);
        }
        int[] num = new int[m];
        for (int i=0; i<m; i++){
            int n = sc.nextInt();
            if (n<1 || n>10) {
                System.out.println("Please enter a valid number (1-10)!");
                System.exit(1);
            }
            num[i]=n;
        }
        sc.close();

        System.out.println(Arrays.toString(num));
        System.out.println("mean is: " + mean(num));
        median(num);
        System.out.println("median is: " + median(num));
        System.out.println("mode is: "+ mode(num));
    }

    public static double mean(int[] arr){
        int sum=0;
        for (int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum*(1.0)/arr.length;
    }

    public static double median(int[] arr){
        Arrays.sort(arr);
        
        // System.out.println(Arrays.toString(arr));
        if (arr.length%2==0){
            return (arr[arr.length/2-1]+arr[(arr.length/2)])*(1.0)/2;
        }
        else if (arr.length%2!=0){
            return arr[arr.length/2];
        }
        return 0;

    }

    public static String mode(int[] arr){
        Arrays.sort(arr);
        int cnt=0;
        int cntmax=0;
        int ii=0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]==arr[i+1]){
                cnt++;
                if (cnt>cntmax) {
                    cntmax=cnt;
                    ii=i;
                }
            }
            else cnt=0;
        }
        if (cntmax==0){
            return "no mode!";
        }
        else return Integer.toString(arr[ii]);
    }
}

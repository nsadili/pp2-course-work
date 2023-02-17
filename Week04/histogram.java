import java.util.Scanner;

public class histogram {
    public static void main(String[] args) {
        int n = 0;
        int i=0;
        int f=0;
        float sum=0;
        System.out.println("Please, enter the number of students");
        Scanner input = new Scanner(System.in);
        n=input.nextInt();
        int[] gr = new int[n];
        System.out.println("Enter the grades");
        Scanner sc = new Scanner(System.in);

        while(f<n) {
            gr[i] = sc.nextInt();
            if(gr[i] > 10 || gr[i] < 0) {
                System.out.println("Enter the number in range 1-10");
                System.exit(1);
            }
            i++;
            f++;
        }
        System.out.println("The grades are:");
        printArr(gr);
        System.out.println("the mean is: " + mean(gr));
        System.out.println("The median is: " + median(gr));
        System.out.println("the mode is: " + mode(gr));


        //if(gr.length%2==1) System.out.println("the median is: " + gr[n/2]);
        //else {
            //float m = gr[gr.length/2] + gr[(gr.length/2)-1];
            //System.out.println("The median is: " + (float)m/2);
        //}
        

    }

    private static void printArr(int[] arr) {
        for(int el: arr) System.out.println(el + "");
        System.out.println();
    }

    private static float mean(int[] arr) {
        int sum=0;
    
        for(int n=0; n <= arr.length-1; n++) {
            sum += arr[n];
        }
        float average=0;
        average= sum / arr.length;
        return average;
    }

    private static float median(int[] arr) {
        float m=0;
        if(arr.length%2==1) return arr[arr.length/2];
        else {
            m = arr[arr.length/2] + arr[(arr.length/2)-1];
            return m/2;
        }
    }

    private static int mode(int[] arr) {
        int[] cnt = new int[arr.length + 1];
        int i=0;
        for(i=0; i<=arr.length-1; i++) {
            cnt[arr[i]]++;
        }
        int max=cnt[0];
        for(i=0; i<=cnt.length-1; i++){
            if(cnt[i]>max) max=cnt[i];
        }
        return max;

    }
}

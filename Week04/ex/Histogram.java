import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        int[] grades= {1,2,3,4,5,6};
        int[] cnt = new int[11];
        for(int i=0;i<grades.length;i++){
            cnt[grades[i]]++;
        }
        System.out.println(grades.length);
        System.out.println("HISTOGRAM");
        System.out.println();
        for(int j=1;j<=10;j++){
            System.out.print(j+": ");
            printX(cnt[j]);
        }
        System.out.printf("MEAN: %.2f\n", mean(grades));
        System.out.print("MEDIAN: ");
        median(grades);
        
    }
    
    private static void printX(int cnt){
        for(int i=1;i<=cnt;i++){
            System.out.print("x");
        }
        System.out.println();
    }

    private static float mean(int[] chars){ //did not work for floats
        var sum=0;
        var A = chars.length;
        for (int i=0;i<A;i++){
            sum+=chars[i];
        }
        float mean = (float)sum/A;
        return A;
    }
    private static void median(int[] chars){
        int a;
        float m;
        int b;

        if(chars.length%2!=0){
            a = chars.length/2;
            m=chars[a];
            System.out.printf("%.2f", m);
        }
        else if(chars.length%2==0){
            b = chars.length/2;
            m= (chars[b-1]+chars[b])/2;
            System.out.printf("%.2f", m);
        }

    }
    
}
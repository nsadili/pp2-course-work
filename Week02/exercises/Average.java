import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Average {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N;
        var sum=0;
        var cnt=0;

        while (sc.hasNextInt()){
            N=sc.nextInt();
            sum+=N;
            cnt++;
        }
        if (cnt==0) System.out.print("Please enter a number!");
        else {
            float ave=sum/cnt;
            System.out.print(ave);
        }
    }
}
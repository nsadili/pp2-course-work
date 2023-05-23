package Week02;

import java.util.Scanner;
public class Average {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int count =0;
        var sum=0;
        while(scan.hasNextInt())
        {
            sum+=scan.nextInt();
            count++;
         }
        // avg= (double)sum/count;
        System.out.println((double)sum/count);



    }
}
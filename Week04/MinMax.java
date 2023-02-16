import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int sample[] = new int[9];
        int i=0;
        System.out.println("enter 10 numbers: ");
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            sample[i] = sc.nextInt();
            i++;
        }
        int max=sample[0];
        int min=sample[0];
        for(int k=0; k<=sample.length-1; k++) {
            if(sample[k] > max) max = sample[k];
        }
        for(int j=0; j<=sample.length-1; j++) {
            if(sample[j] < min) min = sample[j];
        }
        System.out.println("Max is: " + max);
        System.out.println("Min is: " + min);
    }
    //Index 9 out of bounds for length 9
}
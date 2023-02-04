import java.util.Scanner;

public class MinMax {
    
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int min=999999999;
        int max=-999999999;

        while (sc.hasNext()){
            int n = sc.nextInt();
            if (n<min) min=n;
            if (n>max) max=n;
        }

        System.out.printf("minimum is: %d\nmaximum is: %d\n",min,max);
        sc.close();
    }
}

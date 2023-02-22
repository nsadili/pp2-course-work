package Week04.practicalwork;

import java.util.Scanner;

public class greatsmall {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String[] box = sc.nextLine().split(" ");
        System.out.println("Minimum: "+ minArray(box));
        System.out.println("Maximum: " + maxArray(box) );
    }

    public static int minArray(String[] qutu){
        int min = Integer.parseInt(qutu[0]);
        int num;
        for(String a : qutu){
            num = Integer.parseInt(a);
            if(min>num) min = num;
        }
        return min;

    }
    public static int maxArray(String[] qutu){
        int max = Integer.parseInt(qutu[0]);
        int num;
        for(String a : qutu){
            num = Integer.parseInt(a);
            if(max<num) max = num;
        }
        return max;

    }

}

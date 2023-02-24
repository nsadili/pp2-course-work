package Week04.PW_2;

import java.util.Arrays;

public class Elements {
    private static int min(int[] arr){
        return Arrays.stream(arr).min().getAsInt();
    }
    private static int max(int[] arr){
        return Arrays.stream(arr).max().getAsInt();
    }
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments");
            System.exit(0);
        }
        int[] numb = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numb[i] = Integer.parseInt(args[i]);
        }
        System.out.print("Min:"+min(numb)+ "\nMax:"+max(numb)+"\n");
    }
    
}
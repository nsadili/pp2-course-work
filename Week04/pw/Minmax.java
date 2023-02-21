import java.util.Arrays;

public class Minmax {
    public static void main(String[] args) {

        int[] n = new int[args.length];
        for (int i = 0; i < n.length; i++)
            n[i] = Integer.valueOf(args[i]);
            int min = n[0], max = n[0];
            
        for (int i = 1; i < n.length; i++) {
            if (n[i] > max)
                max = n[i];
            if (n[i] < min)
                min = n[i];
        }
        
    

        System.out.println(Arrays.toString(n));
        System.out.println("Min: " + min + "  " + "Max: " + max);
    }
}
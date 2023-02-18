import java.util.Arrays;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] a = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            a[i] = Integer.parseInt(args[i]);
        }
        System.out.println("");
        printArray(a);

        int min = Min(a);
        int max = Max(a);
        System.out.println(min);
        System.out.println(max);
    }

        
    public static int Min(int[] a) {
          int min = a[0];
  for (int i = 0; i < a.length; i++)
            if (a[i] < min) {
                min = a[i];
            }
        return min;
    }

      public static int Max(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++)
            if (a[i] > max) {
                max = a[i];
            }
        return max;
    }
           
     
    
       public static void printArray(int[] a) {
        System.out.println(Arrays.toString(a));
    }
}




            


     

       



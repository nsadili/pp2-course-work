import java.util.Arrays;

import javax.sound.sampled.SourceDataLine;

public class PW1 {
   public static void main(String[] args) {


    int num[] = new int[args.length];
        for(int i=0; i<args.length; i++) {
        num[i] = Integer.parseInt(args[i]); // here we convert to integer
    }
    
    if(num.length == 0) {
        System.out.println("Please provide a number!");
        System.exit(0);
    }
    System.out.println(Arrays.toString(num));
    System.out.println(min(num)); //arr or num it doesnt give max whyy?
    System.out.println(max(num));
    
}
   

public static int min(int[] arr) {
    int min = arr [0];
    for (int i=0; i<arr.length; i++) {
        if(min > arr[i]) {
            min = arr[i];
        }
    }
        return min;
}



    public static int max(int[] arr) {
       int max = arr [0];
       for (int i=0; i<arr.length; i++) {
        if(max < arr[i]) {
            max = arr[i];
    }
}
       return max;
    
    }

}


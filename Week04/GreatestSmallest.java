import java.util.Arrays;
import java.util.Scanner;

public class GreatestSmallest {
    public static void main(String args[]) {

        int[] numbers= new int[args.length];
        for(int i=0;i<args.length;i++) {
            numbers[i]=Integer.parseInt(args[i]);
        }

        System.out.println(MAX(numbers));
        System.out.println(MIN(numbers));


        Scanner scan=new Scanner(System.in);
        
        String input=scan.nextLine();

        System.out.println(getMax(input));
        System.out.println(getMin(input));

        Both(input);
    }

    public static int MAX(int[] arr) {
        int max=arr[0];

        for(int x: arr){
            if(x>max) max=x;
        }

        return max;
    }

    public static int MIN(int[] arr) {
        int min=arr[0];

        for(int x: arr){
            if(x<min) min=x;
        }

        return min;
    }

    public static int getMax(String array)
    {
        int max = Integer.parseInt(array.split(" ")[0]);

        for (int i = 0; i < array.split(" ").length; i++)
            if (Integer.parseInt(array.split(" ")[i]) > max)
                max = Integer.parseInt(array.split(" ")[i]);

        return max;
    }

    public static int getMin(String array)
    {
        int min = Integer.parseInt(array.split(" ")[0]);

        for (int i = 0; i < array.split(" ").length; i++)
            if (Integer.parseInt(array.split(" ")[i]) < min)
                min = Integer.parseInt(array.split(" ")[i]);

        return min;
    }

    public static void Both(String array){
        System.out.println("Min: "+getMin(array)+"\nMax: "+getMax(array));
    }
}

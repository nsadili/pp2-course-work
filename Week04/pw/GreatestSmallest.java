public class GreatestSmallest{
    public static void main(String[] args) {
        if (args.length==0){
            System.out.println("Please, enter integer");
            System.exit(1);
        }

        int num[] = new int [args.length];
        for (int i=0; i<args.length; i++){
            num[i] = Integer.parseInt(args[i]);
        }

        // for (int i=0; i<0; i++){
        //     if (num[i]<min) min=num[i];
        // } 

        // System.out.println("Maximum value is" + max);
        // System.out.println("minimum value is" + min);
        System.out.println("Maximum value is " + min(num));
        System.out.println("Minimum value is "+ max(num));
        System.out.println("Maximum and minimum values are respectively " + MaxMin(num));
    }

    public static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            if (arr[i]>max) max=arr[i];
        }
        return max;
    }

    public static int min(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++){
            if (arr[i]<min) min=arr[i];
        }
        return min;
    }

    public static String MaxMin(int[] arr){
        return max(arr) + " " + min(arr);
    }
}
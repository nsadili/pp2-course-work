public class MinMax {
    
    public static void main(String[] args) {
        
       if (args.length == 0) {
       System.out.println("PLease, provide at least some input.");
        System.exit(1);
       }

       int numbers[] = new int[args.length];
       for (int i = 0; i < args.length; i++) {
        numbers[i] = Integer.parseInt(args[i]);
       }

       System.out.println("The min of numbers is: " + printMinArr(numbers)); 
       System.out.println("The max of numbers is: " + printMaxArr(numbers)); 

      
    } private static int printMinArr(int[] arr) {

        var min = 1000;

        for (var el : arr) {
            if (el < min)
            min = el;
        }
        return min;
       }

       private static int printMaxArr(int[] arr) {

        var max = 0;

        for (var el : arr) {
            if (el > max)
            max = el;
        }
        return max;
       }
       

}

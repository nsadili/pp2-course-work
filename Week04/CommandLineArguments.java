public class CommandLineArguments {
    public static void main(String[] args) {
      // Get input from user using command line
      System.out.println("The arguments passed in are:");
      for (String arg : args) {
        System.out.println(arg);
      }
  
      // Get an array of integers from user using command line
      int[] intArray = new int[args.length];
      for (int i = 0; i < args.length; i++) {
        intArray[i] = Integer.parseInt(args[i]);
      }
  
      // Print the array of integers
      printIntArray(intArray);
  
      // Calculate and print the sum and average of the numbers
      int sum = calculateSum(intArray);
      double average = (double) sum / intArray.length;
      System.out.println("Sum: " + sum);
      System.out.println("Average: " + average);
    }
  
    // Method to print an array of integers
    public static void printIntArray(int[] arr) {
      System.out.println("The array of integers is:");
      for (int num : arr) {
        System.out.print(num + " ");
      }
      System.out.println();
    }
  
    // Method to calculate the sum of an array of integers
    public static int calculateSum(int[] arr) {
      int sum = 0;
      for (int num : arr) {
        sum += num;
      }
      return sum;
    }
  }
  
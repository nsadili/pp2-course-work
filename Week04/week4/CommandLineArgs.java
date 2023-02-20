package week4;
public class CommandLineArgs {
    public static void main(String [] args)
    {
        int[] arr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
            System.out.println("your array: ");
            printArray(arr);
            System.out.println("the sum of elements: ");
            sumArray(arr);
            
            

    }
          public static void printArray(int[] array) {
            System.out.print("The array is: [");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
                if (i < array.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    
        public static int sumArray(int[] array )
        {
            int sum = 0;
            for(int i= 0; i < array.length; i++)
            {
                sum +=array[i];
            }
            return sum;
        }

    }
    


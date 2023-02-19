package Week04.ex01;

public class arguments {
    private static void printArray(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }
    private static int sum(int[] arr){
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
        }
        return sum;
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
        printArray(numb);
        System.out.print(sum(numb)+ "\n");
    }
    
}

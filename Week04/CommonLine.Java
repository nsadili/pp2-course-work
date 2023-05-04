public class CommonLine{

    public static void main(String{} args) {

        if(args.length == 0) {
            System.out.println(x: "Please, enter a value");
            System.exit(status:1);
        }

        System.out.println(Arrays.toString(args));

        int numbers[] = new int[args.length]
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }

        printArrays(numbers);

        System.out.println(Arrays.toString(numbers));
    }

    private static void printArray(int[] arr) {

        for(int el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    private static void printArray(int[] arr) {

    private static int sum(int[] arr) {

        var sum = 0;
        for (var el : arr) {
            sum += el;
        }

    }
    }
}
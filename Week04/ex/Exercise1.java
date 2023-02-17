public class Exercise1 {
    public static void main(String[] args) {
        if (args.length==0){
            System.out.println("Please, enter integer");
            System.exit(1);
        }

        int numbers[] = new int [args.length];
        for (int i=0; i<args.length; i++){
            numbers[i] = Integer.parseInt(args[i]);
        }

        //System.out.println(Arrays.toString(args));
        //System.out.println(Arrays.toString(numbers));
        printArr(numbers);
        System.out.println(sumArr(numbers));
    }
    
    private static void printArr(int[] arr){
            for (var el: arr){
                System.out.println(el+" ");
            }
        }

    private static int sumArr(int[] arr){
            int sum=0;
            for (int el: arr){
                sum+=el;
            }
            //System.out.println(sum);
            return sum;
        }
        

}
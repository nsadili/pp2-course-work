

public class Ex1{
     public static void main(String[] args){
         if(args.length ==0){
            System.out.println("Please, enter at least an integer");
            System.exit(1);

        }
         int numbers[]= new int[args.length];
         for(int i=0; i<args.length;i++){
            numbers[i]= Integer.parseInt(args[i]);
         }
        
         
        
         printArray(numbers);
         System.out.println(" ");

         System.out.println("Sum: " +Sum(numbers));
         System.out.println("Average: "+ Average(numbers));


     }
   

     private static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


     }
     private  static int Sum(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;

     }
     private static double Average(int[] arr){
        int sum= Sum(arr);
        double av= (double) sum/arr.length;
        return av;
     }
}
public class MathDemo{

public static int min(int a, int b){
    return Integer.min(a , b);
}

 public static int max(int a, int b){
    return a > b ? a: b;
 }

 public static int sum(int[] args){
     var  sum =0;
     for(var i=0; i < args.length; i++)
     {
        sum += args[i]; 
     }
     return sum;
 }
   public static float mean(int[] args){

    var sum =sum(args);
    float length = args.length*1F;
      return sum/length;
   }


   public static int factorial(int n){
     if(n > 1) return n*factorial(--n);
     return 1;

   }

     

   public static void main(String[] args){
    int[] arr ={2,4,6,8};
    System.out.println(factorial(6));
    System.out.println(sum(arr));
    System.out.println(mean(arr));
   }























   


}
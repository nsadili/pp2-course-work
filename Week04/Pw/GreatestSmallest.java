public class GreatestSmallest{
  public static void main(String[] args){
    if(args.length==0){
        System.out.println("Please, enter at least an integer");
        System.exit(1);
    } 
    int numbers[]= new int[args.length];
    for(int i=0;i<args.length;i++){
    numbers[i]= Integer.parseInt(args[i]);



    }
   System.out.println("Minimum is : " + PrintMin(numbers));
   System.out.println("Maximum is : " +PrintMax(numbers));


}
private static int PrintMin(int[] arr){
    int min= Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++){
        if(min>arr[i]){
            min= arr[i];
        }
    }
    return min;
}
private static int PrintMax(int[] arr) {
    int max= Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(max<arr[i]){
            max=arr[i];
        }
    }
    return max;
}


   
}
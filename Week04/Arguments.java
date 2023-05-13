import java.util.Arrays;

public class Arguments {
 public static void main(String[] args) {

    if(args.length == 0) {
        System.out.println("Please, enter a number");
        System.exit(1);
    }
    System.out.println(Arrays.toString(args));
    int[] n= new int[args.length]; 
    for (int i=0; i<args.length; i++){
 n[i]= Integer.parseInt(args[i]);
    }
//System.out.println(n);
//System.out.println(Arrays.toString(args));
 
 //static void 
 printArray(n);
    int sum = sum(n);
    System.out.println("sum of elements" + sum); 
}

private static void printArray(int[] a){

    for( var el : a){
        System.out.println(el + " "); 
    }
    System.out.println(); 
}
private static int sum(int[] a) {
    var sum =0;
    for(var el : a){
        sum +=el;
    }
    return sum;

}
  
}

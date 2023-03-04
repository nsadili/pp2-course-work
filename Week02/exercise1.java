import java.util.Arrays ;
public class exercise1 {
    public static void main(String[] args) {
       if ( args.length == 0) {
        System.out.println( "please enter an integer. ");
        System.exit(1);
       
       }
       int numbers[] = new int[args.length] ;
       for ( int i=0 ; i<args.length ; i++) {
        numbers[i] = Integer.parseInt(args[i]) ;

       }
       System.out.println(Arrays.toString(args));
       System.out.println(Arrays.toString(numbers));
    }
}
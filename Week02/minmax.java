public class minmax {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE ;
        int max = Integer.MIN_VALUE ;
        for (int i=0 ; i< args.length ; i++) {
         int num = Integer.parseInt(args[i]) ;
        if ( num< min) { min= num ; }
        if( num> max ) { max = num ; }
        }
        System.out.println(min);
        System.out.println(max);


    }
}

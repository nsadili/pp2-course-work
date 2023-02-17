public class exercise01 {
    public static void main(String[] args){
        int[] num = new int[args.length] ;
        for (int  i=0 ; i< args.length ; i++) {
            num[i] = Integer.parseInt(args[i]) ;
        }
        printArray(num) ;
        int sum  =  calculateSum(num) ;
        double avarage = (double) sum/num.length ;
        System.out.println(sum);
        System.out.println(avarage);

    }
    public static void printArray(int[]arr){
        for ( int i=0 ; i<arr.length ; i++)
        System.out.println(arr[i]+ "");
    }

public static int calculateSum(int [] arr){
    int sum = 0 ;
    for (int i=0 ; i<arr.length ; i++) {
    sum += arr[i] ;

}
return sum ;
}
}

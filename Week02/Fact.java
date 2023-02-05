public class Fact {
    public static void main(String[] args){
    if(args.length < 1){
        System.out.println("Please, provide some input");
        System.exit(1);
    }
    var n=Integer.parseInt(args[0]);
    var f=1L;
    if(n<0){
        System.out.println("Please, enter a nonnegative number");
        System.exit(1);
    }
    for(int c=1; c<=n;c++)
    f*=c;


    System.out.printf("%d! = %d\n", n, f);
    }
}
   

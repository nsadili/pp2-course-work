public class Fact {
    public static void main(String[] args){
        if(args.length < 1 ){
            System.out.println("Please enter an integer.");
            System.exit(1);
        }

        var n =Integer.parseInt(args[0]);
        if (n < 0){

            System.out.println("Please enter a positive integer.");
            System.exit(1);
        
            }

        var f = 1L;
        var count = 1;

        while(count <= n){
            f *= count;
            count++;

        }
    System.out.printf("%d! = %d\n", n, f);
    }
}

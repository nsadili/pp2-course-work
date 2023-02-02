public class Fact {
    public static void main(String[] args) {
        if(args.length<1){
            System.out.println("Please enter the number");
            return;
        }

        var num=Integer.parseInt(args[0]);

        if(num<0){
            System.out.println("Please enter non-negative number");
            System.exit(1);
        }
        var fact=1L;
        var c=1;

        while(c<=num){
            fact*=c;
            c++;


        }
        System.out.printf("%d!=%d",num,fact);
    }
}

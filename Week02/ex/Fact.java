public class Fact {
    public static void main(String args[]){
        int a = Integer.valueOf(args[0]) +1;
        int aCopy = a;
        int res = 1;
        if(args.length < 1){
            System.out.println("Try again!");
        }

        while(a-- >  1){
            res *= a;
        }
        System.out.printf("" + res);
    }
}

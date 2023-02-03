public class Calc {
    public static void main(String[] args){

        if (args.length < 2) {
            System.out.println("Please, enter two integers: ");
            System.out.println(1);
        }
        System.out.println(args[0]);
        System.out.println(args[1]);

        var a = Integer.parseInt(args[0]);
        var b = Integer.parseInt(args[1]);
    


        System.out.println(a + b);
    }
}

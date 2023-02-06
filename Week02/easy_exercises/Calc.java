public class Calc {
    public static void main(String[] args) throws Exception{

        if (args.length < 2){
            System.out.println("Please enter two numbers.");
            System.exit(1);
        }

        var n1 = Integer.parseInt(args[0]); //First way of converting string to int
        var n2 = Integer.valueOf(args[1]); //Second way of converting string to int

        System.out.println(args[0]);
        System.out.println(args[1]);

        System.out.println(n1 + n2);
    }
}
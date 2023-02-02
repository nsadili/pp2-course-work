public class Calc {
    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Please, enter two numbers!");
            System.exit(1);
        }

        var x = Integer.parseInt(args[0]);
        var y = Integer.valueOf(args[1]);

        System.out.println(x + y);

    }
}
public class Calc {
    public static void main(String[] args) {
if (args.length <2 ) {
    System.out.println("Please, enter 2 integers");
    System.exit(1);
}

        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[1] + args[0]);
        var a = Integer.parseInt(args[0]);
        var b = Integer.valueOf(args[1]);
        System.out.println(a+b);
    }
}
public class Calc {
    public static void main(String[] args) {
        if(args.length<2) {
            System.out.println("Please, enter two integers");
            System.exit(1);
        }
        var a=Integer.parseInt(args[0]);
        var b=Integer.valueOf(args[1]);
        System.out.printf("%d + %d = %d\n", a,b, a+b);
        System.out.printf("%d - %d = %d\n", a, b, a-b);
        System.out.printf("%d * %d = %d\n", a, b, a*b);
        System.out.printf("%d / %d = %d\n", a,b, a/b);

    }
}

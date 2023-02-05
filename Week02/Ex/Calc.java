public class Calc {
    public static void main(String[] args) {

        if(args.length < 2) {
            System.out.println("Please, provide two numbers!");
            System.exit(1);
        }
        int n1;
        int n2;
        n1 = Integer.parseInt(args[0]);
        n2 = Integer.parseInt(args[1]);
        System.out.println(n1 + n2);
        System.out.println(n1 - n2);
        System.out.println(n1 * n2);
        System.out.println(n1 / n2);
        System.out.println(n1 % n2);

    }
}

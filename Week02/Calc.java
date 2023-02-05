public class Calc {
    public static void main(String [] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("The sum is" + (a+b));
        System.out.println("The subtraction is" + (a-b));
        System.out.println("The multiplication is" + a*b);
        System.out.println(a/b);
        System.out.print(a%b);
    }
}
public class Calc {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int sum=a+b;
        int sub=a-b;
        int multi=a*b;
        int division=a/b;
        int remainder=a%b;



        System.out.println("Sum: "+sum);
        System.out.println("Subtraction: "+sub);
        System.out.println("Multiplication: "+multi);
        System.out.println("Division: "+division);
        System.out.println("Remainder: "+remainder);


    }
}

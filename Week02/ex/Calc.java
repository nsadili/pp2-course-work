package ex;
public class Calc {
    public static void main(String [] args) {
        int n1 = Integer.parselnt(args[0]);
        int n2 = Integer.parselnt(args[1]);
        int sum = n1 + n2;
        int sub = n1 - n2;
        int mul = n1 * n2;
        int div = n1 / n2;
        int rem = n1 % n2;
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(rem);
    }
}

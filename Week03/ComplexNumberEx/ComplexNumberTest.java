package Week03.ComplexNumberEx;

import java.util.Scanner;

public class ComplexNumberTest {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double x = sc.nextDouble(), y = sc.nextDouble();
            int n = sc.nextInt();
            ComplexNumber input = new ComplexNumber(x, y);
            ComplexNumber res = new ComplexNumber(x, y);
            for (; n > 1; n--) res = input.mult(res);
            System.out.println(res.toString());
        }
        ComplexNumber num1 = new ComplexNumber(1, 1);
        ComplexNumber num2 = new ComplexNumber(2, -3);
        ComplexNumber num3 = new ComplexNumber(3, 0);
        ComplexNumber num4 = new ComplexNumber(0, 1);
        System.out.println(num1.toString());
        System.out.println(num2.toString());
        System.out.println(num3.toString());
        System.out.println(num4.toString());
        ComplexNumber num5 = num4.mult(num2);
        System.out.println(num5.toString());
        ComplexNumber num6 = num5.conjugate();
        System.out.println(num6.toString());
        ComplexNumber num7 = num6.abs();
        System.out.println(num7.toString());
        ComplexNumber num8 = num7.add(num4.mult(new ComplexNumber(9.112, 12.12)));
        System.out.println(num8.toString());
    }
}

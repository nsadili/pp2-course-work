package Week11.Ex3;

public class Main {
    public static void main(String[] args) {
        Calculator sum = (a,b)->a+b;
        Calculator sub = (a,b)->a-b;
        Calculator mul = (a,b)->a*b;
        Calculator div = (a,b)->a/b;
        Calculator exp = (a,b)->Math.pow(a, b);

        System.out.println("addition: "+sum.calculate(10.7, 2.3));
        System.out.println("subtraction: "+sub.calculate(15, 2.5));
        System.out.println("multiplication: "+mul.calculate(1.5, 3.5));
        System.out.println("division: "+div.calculate(12.5, 5));
        System.out.println("exponentiation: "+exp.calculate(10, 2));
    }
}

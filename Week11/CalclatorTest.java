package Week11;

public class CalclatorTest {
    public static void main(String[] args) {
        Calclator add = (a, b) -> a+b;
        Calclator sub = (a, b) -> a-b;
        Calclator multi = (a, b) -> a*b;
        Calclator div = (a, b) -> a/b;
        Calclator expo = (a, b) -> Math.pow(a, b);

        System.out.println(add.calculate(4, 6));
    }
}

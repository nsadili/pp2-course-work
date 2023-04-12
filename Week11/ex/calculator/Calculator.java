package calculator;

public interface Calculator {
    double calculate(double a, double b);

    Calculator calcAdd = (a, b) -> a + b;

    Calculator calcSub = (a, b) -> a - b;

    Calculator calcMult = (a, b) -> a * b;

    Calculator calcDiv = (a, b) -> a / b;

    Calculator calcExp = (a, b) -> Math.pow(a, b);

    public static void main(String[] args) {
        System.out.println(calcAdd.calculate(3, 5));
        System.out.println(calcSub.calculate(5, 3));
        System.out.println(calcMult.calculate(3, 5));
        System.out.println(calcDiv.calculate(15, 3));
        System.out.println(calcExp.calculate(2, 3));
    }
}

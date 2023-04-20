package calculator;

public class TestCalculator{
    public static void main(String[] args) {
        Calculator addition = (a,b) -> a+b;
        Calculator subtraction = (a,b) -> a-b;
        Calculator multiply= (a, b) -> a*b;
        Calculator division = (a,b) -> a/b;
        Calculator exp= (a,b) -> Math.pow(a, b);
        System.out.println(addition.calculate(4, 5));
        System.out.println(subtraction.calculate(200, 5));
        System.out.println(multiply.calculate(7, 8));
        System.out.println(division.calculate(60, 20));
        System.out.println(exp.calculate(5, 3));
        
    }

}
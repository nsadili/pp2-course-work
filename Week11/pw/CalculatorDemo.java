interface Calculator{
    double calculate(double a, double b);
}
public class CalculatorDemo{
    public static void main(String[] args) {
        Calculator add = (a,b) -> a+b;
        Calculator subt = (a,b) -> a-b;
        Calculator mult = (a,b) -> a*b;
        Calculator div = (a,b) -> a/b;
        Calculator exp = (a,b) -> Math.pow(a, b);

        System.out.println("ADD: "+add.calculate(3,5));
        System.out.println("SUBT: "+subt.calculate(9,5));
        System.out.println("MULT: "+mult.calculate(3,5));
        System.out.println("DIV: "+div.calculate(30,5));
        System.out.println("EXP: "+exp.calculate(3,3));
    }
}


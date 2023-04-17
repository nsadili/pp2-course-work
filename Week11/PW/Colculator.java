public interface Calculator {
    double calculate(double a, double b);
}

public class Main {
    public static void main(String[] args) {
        Calculator addition = (a,b) -> (a+b);
        Calculator subtraction =(a,b) ->  (a-b);
        Calculator  multiplication =(a,b) ->  (a*b);
        Calculator division = (a,b) ->  (a/b);
        Calculator exponentiation =(a,b) -> (Math.pow(a,b));
    }
}
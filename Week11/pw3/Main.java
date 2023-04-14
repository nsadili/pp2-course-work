package pw3;

class Main {
    public static void main(String[] args) {
        Calculator addition = (a, b) -> a + b;

        Calculator subtraction = (a, b) -> a - b;

        Calculator multiplication = (a, b) -> a * b;

        Calculator division = (a, b) -> a / b;

        Calculator exponentiation = (a, b) -> Math.pow(a, b);

        double res1 = addition.calculate(5, 3);         
        double res2 = subtraction.calculate(5, 3);       
        double res3 = multiplication.calculate(5, 3);   
        double res4 = division.calculate(5, 3);           
        double res5 = exponentiation.calculate(5, 3);     

        System.out.println("Addition: " + res1);
        System.out.println("Subtraction: " + res2);
        System.out.println("Multiplication: " + res3);
        System.out.println("Division: " + res4);
        System.out.println("Exponentiation: " + res5);
    }
}

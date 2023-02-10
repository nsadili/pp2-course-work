package ComplexNumbers;

public class ComplexNumberTest {
    public static void main(String[] args){
        ComplexNumber num1 = new ComplexNumber(2,3); // 2+3i
        ComplexNumber num2 = new ComplexNumber(1,-7); // 1-7i

        System.out.println(num1.re());
        System.out.println(num2.imag());
        System.out.println(num1.tostring());
        System.out.println(num1.equals(num2));
        System.out.println(num2.conjugate());
        System.out.println(num2.abs());
        System.out.println(num1.sub(num2));
        System.out.println(num2.mult(num1));
        
        // EXTRA - Exponentiation
        System.out.println(num1.expo(num2, 4));
    }
}

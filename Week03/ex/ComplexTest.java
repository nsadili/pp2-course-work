import pp2.week03.math.ComplexNumber;

public class ComplexTest {
    public static void main(String[] args) {
        ComplexNumber CN = new ComplexNumber(3.0,4.0);
        ComplexNumber number = new ComplexNumber(5.0, 6.0);

            System.out.printf("\nWe checked if the CN and number are same or not: %b\n\n", CN.equals(number)); // EQUALS method
            System.out.printf("Here is the our complex number: %s\n\n", CN.toString());
            System.out.printf("Our Real Part: %f\n", CN.re());
            System.out.printf("Our Imaginary part: %f\n\n", CN.imag());
            //CN.conjugate();
            System.out.printf("Let's Conjugate Our Complex Number: \n\n"); //need to edit
            System.out.printf("The Absolute Value of the Complex Number: %f\n\n", CN.abs());
            System.out.println("Lets add NUMBER to the CN: " + CN.add(number));
            System.out.println("Lets substract NUMBER to the CN: " + CN.sub(number));
            System.out.println("Lets multiply NUMBER to the CN: " + CN.mult(number));
    }
}

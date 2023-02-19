package pp2.week03.math;

public class ComplexTest {



    public static void main(String[] args) {


        ComplexNumber c1 = new ComplexNumber(3, 5);
        ComplexNumber c2 = new ComplexNumber(7, -2);



        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);



        System.out.println("c1 equals c2: " + c1.equals(c2));



        ComplexNumber c3 = c1.add(c2);
        System.out.println("c1 + c2 = " + c3);



        ComplexNumber c4 = c1.sub(c2);
        System.out.println("c1 - c2 = " + c4);



        ComplexNumber c5 = c1.mult(c2);
        System.out.println("c1 * c2 = " + c5);



        ComplexNumber c6 = c1.conjugate();
        System.out.println("Conjugate of c1: " + c6);



        ComplexNumber c7 = c1.abs();
        System.out.println("Absolute value of c1: " + c7);



        ComplexNumber c8 = c1.pow(3);
        System.out.println("c1^3: " + c8);


    }
}

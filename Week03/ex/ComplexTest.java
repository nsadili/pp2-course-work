import pp2.week03.math.ComplexNumber;
import java.util.Scanner;

public class ComplexTest {
   
   
    public static void main(String[] args) {
    ComplexNumber t= new ComplexNumber(5,7);
    ComplexNumber t2= new ComplexNumber(3,6);
    System.out.println("First complex number: " +t.toString());
    System.out.println("Second complex number: " +t2.toString());
    System.out.println("Are they equal? " + t.equals(t2));
    System.out.println("Real part of first number: " + t.re());
    System.out.println("Real part of second number: " + t2.re());
    System.out.println("Imaginary part of first number: " + t.imag());
    System.out.println("Imaginary part of second number: " + t2.imag());
    ComplexNumber t3= t.conjugate();
    System.out.println("Updated first complex number: " + t3.toString());
    System.out.println("Real part of updated first complex number: " + t3.re());
    System.out.println("Imaginary part of updated  first complex number: " + t3.imag());
   
    System.out.println("Addition: " + t.add(t2));
    System.out.println("Substraction: " +t.sub(t2));
    System.out.println("Multiplication: " + t.mult(t2));

    System.out.println("Enter n please: ");
    Scanner scan = new Scanner(System.in);
    int n= scan.nextInt();

    System.out.println("Exponentiation of first complex number: "+ t.exponentiate(n)) ;
    System.out.println("Exponentiation of second complex number: "+ t2.exponentiate(n)) ;
    System.out.println("Exponentiation of updated complex number: "+ t.exponentiate(n)) ;





    






   
    
    }
}
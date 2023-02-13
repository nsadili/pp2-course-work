import pp2.week03.math.ComplexNumber;

public class ComplexTest {
    public static void main(String[] args) {
ComplexNumber num1 = new ComplexNumber(2,3);
ComplexNumber num2 = new ComplexNumber(1,5);
System.out.println("Number 1 : "+num1);
System.out.println("Number 2 : " +num2);

System.out.println("equals- "+num1.equals(num2));
System.out.println("re "+ num1.re() +",imagin "+ num1.imagin());
System.out.println("conjugate "+ num1.conjug());
System.out.println("add, sub, mult "+ num1.add(num2)+", "+ num1.sub(num2) + ", "+ num1.mult(num2));



}
}
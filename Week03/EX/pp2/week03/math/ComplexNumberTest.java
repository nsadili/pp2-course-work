package pp2.week03.math;

public class ComplexNumberTest {
    public static void main(String[] args){
ComplexNumber t = new ComplexNumber(3, 7);

ComplexNumber t1= new ComplexNumber(-4, -5);
System.out.println(t.equals(t));
System.out.println(t.equals(t1));
System.out.println(t.toString());
System.out.println(t1.toString());
System.out.println(t1.imag());
System.out.println(t.re());
System.out.println(t.conjugate());
System.out.println(t1.mult(t));
System.out.println(t.subtract(t1));
System.out.println(t.add(t1));
    }
}

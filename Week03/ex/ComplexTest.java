import pp2.week3.math.ComplexNumber;

public class ComplexTest {
    public static void main(String[] args) {

        ComplexNumber n = new ComplexNumber(3, 4);
        ComplexNumber n2 = new ComplexNumber(10, 12);

        System.out.println(n.toString());
        System.out.println(n2.toString());

        System.out.println(n.equals(n2));
        System.out.println(n.re());
        var n3 = n2.conjugate();

        System.out.println(n3.img());
        System.out.println(n3.re());
        System.out.println(n3.abs().img());

        System.out.println(n2.abs2().re() + ", " + n2.abs2().img());

        System.out.println(n.add(n2).re() + ", " + n.add(n2).img());

        System.out.println(n.sub(n2).re() + ", " + n.sub(n2).img());

        var mu=n.mult(n2);
        System.out.println(mu.re()+", "+mu.img());

       ComplexNumber.exp(3, 4, 4);

    }
}

public class complextest {

    public static void main(String[] args) {
        complex c1 = new complex(3, 4);
        complex c2 = new complex(3, 4);
        complex c3 = new complex(1, 1);

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);

        System.out.println("c1 equals c2: " + c1.equals(c2));
        System.out.println("c1 equals c3: " + c1.equals(c3));

        System.out.println("Re(c1) = " + c1.getRe());
        System.out.println("Imag(c1) = " + c1.getImag());

        System.out.println("Conjugate of c1: " + c1.conjugate());
        System.out.println("Absolute value of c1: " + c1.abs());

        System.out.println("c1 + c2 = " + c1.add(c2));
        System.out.println("c1 - c2 = " + c1.sub(c2));
        System.out.println("c1 * c2 = " + c1.multiply(c2));
    }
}
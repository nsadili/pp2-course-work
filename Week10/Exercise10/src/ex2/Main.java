package ex2;

public class Main {
    public static void main(String[] args) {
        Numeric<Double> n1 = new Numeric<>(5.25);
        System.out.println("Reciprocal: " + n1.getReciprocal());
        System.out.println("Fractional: " + n1.getFractionalPart());
        System.out.println();

        Numeric<Float> n2 = new Numeric<>(6.74f);
        System.out.println("Reciprocal: " + n2.getReciprocal());
        System.out.println("Fractional: " + n2.getFractionalPart());
        System.out.println("n1 and n2 absolute equality: " + n1.absoluteValueIsEqual(n2));
        System.out.println();

        Numeric<Double> n3 = new Numeric<>(-5.25);
        System.out.println("Reciprocal: " + n2.getReciprocal());
        System.out.println("Fractional: " + n2.getFractionalPart());
        System.out.println("n1 and n3 absolute equality: " + n1.absoluteValueIsEqual(n3));
    }
}

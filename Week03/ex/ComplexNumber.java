package pp2.week03.math;

public class ComplexNumber {
    private double real;
    private double imag;

    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public boolean equals(ComplexNumber number) {
        return this.real == number.real && this.imag == number.imag;
    }

    public String toString() {
        return real + " + " + imag + "i";
    }

    public double re() {
        return real;
    }

    public double imag() {
        return imag;
    }

    public ComplexNumber conjugate() {
        return new ComplexNumber(real, -imag);
    }

    public double abs() {
        return Math.sqrt(real * real + imag * imag);
    }

    public ComplexNumber add(ComplexNumber number) {
        return new ComplexNumber(this.real + number.real, this.imag + number.imag);
    }

    public ComplexNumber sub(ComplexNumber number) {
        return new ComplexNumber(this.real - number.real, this.imag - number.imag);
    }

    public ComplexNumber mult(ComplexNumber number) {
        double real = this.real * number.real - this.imag * number.imag;
        double imag = this.real * number.imag + this.imag * number.real;
        return new ComplexNumber(real, imag);
    }

    public ComplexNumber pow(int n) {
        ComplexNumber result = new ComplexNumber(1, 0);
        for (int i = 0; i < n; i++) {
            result = result.mult(this);
        }
        return result;
    }
}
// The rest of the code

public class ComplexTest {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3, 4);
        ComplexNumber c2 = new ComplexNumber(3, 4);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1.equals(c2));
        System.out.println(c1.re());
        System.out.println(c1.imag());
        System.out.println(c1.conjugate());
        System.out.println(c1.abs());
        System.out.println(c1.add(c2));
        System.out.println(c1.sub(c2));
        System.out.println(c1.mult(c2));
        System.out.println(c1.pow(3));
    }
}
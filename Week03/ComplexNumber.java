package pp2.week3.math;

public class Complex {
    private double realPart;
    private double imaginaryPart;

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public boolean equals(Complex number) {
        return this.realPart == number.realPart && this.imaginaryPart == number.imaginaryPart;
    }

    public String toString() {
        return realPart + " + " + imaginaryPart + "i";
    }

    public double getReal() {
        return realPart;
    }

    public double getImag() {
        return imaginaryPart;
    }

    public Complex conjugate() {
        return new Complex(realPart, -imaginaryPart);
    }

    public double magnitude() {
        return Math.sqrt(realPart * realPart + imaginaryPart * imaginaryPart);
    }

    public Complex add(Complex number) {
        return new Complex(this.realPart + number.realPart, this.imaginaryPart + number.imaginaryPart);
    }

    public Complex subtract(Complex number) {
        return new Complex(this.realPart - number.realPart, this.imaginaryPart - number.imaginaryPart);
    }

    public Complex multiply(Complex number) {
        double real = this.realPart * number.realPart - this.imaginaryPart * number.imaginaryPart;
        double imag = this.realPart * number.imaginaryPart + this.imaginaryPart * number.realPart;
        return new Complex(real, imag);
    }
}

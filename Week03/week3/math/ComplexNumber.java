package pp2.week3.math;

public class ComplexNumber {
    private double real;
    private double imag;

    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public boolean equals(ComplexNumber num) {
        return this.real == num.real && this.imag == num.imag;
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

    public ComplexNumber add(ComplexNumber num) {
        return new ComplexNumber(this.real + num.real, this.imag + num.imag);
    }

    public ComplexNumber sub(ComplexNumber num) {
        return new ComplexNumber(this.real - num.real, this.imag - num.imag);
    }

    public ComplexNumber mult(ComplexNumber num) {
        double realPart = this.real * num.real - this.imag * num.imag;
        double imagPart = this.real * num.imag + this.imag * num.real;
        return new ComplexNumber(realPart, imagPart);
    }
}
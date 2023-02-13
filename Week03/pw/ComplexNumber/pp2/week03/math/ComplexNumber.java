package pp2.week03.math;

public class ComplexNumber{
    
    private double real;
    private double imag;

    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double re() {
        return this.real;
    }

    public double imag() {
        return this.imag;
    }

    public boolean equals(ComplexNumber number) {
        return this.real == number.real && this.imag == number.imag;
    }

    public String toString() {
        return this.real + " + " + this.imag + "i";
    }

    public ComplexNumber conjugate() {
        return new ComplexNumber(this.real, -this.imag);
    }

    public double abs() {
        return Math.sqrt(this.real * this.real + this.imag * this.imag);
    }

    public ComplexNumber add(ComplexNumber number) {
        return new ComplexNumber(this.real + number.real, this.imag + number.imag);
    }

    public ComplexNumber sub(ComplexNumber number) {
        return new ComplexNumber(this.real - number.real, this.imag - number.imag);
    }

    public ComplexNumber mult(ComplexNumber number) {
        return new ComplexNumber(this.real * number.real - this.imag * number.imag, this.real * number.imag + this.imag * number.real);
    }
}


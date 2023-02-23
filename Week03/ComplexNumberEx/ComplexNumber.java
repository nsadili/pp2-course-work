package Week03.ComplexNumberEx;

public class ComplexNumber {
    private double real, imag;

    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double re() {
        return real;
    }

    public double imag() {
        return imag;
    }

    public boolean equals(ComplexNumber number) {
        return this.real == number.re() && this.imag == number.imag();
    }

    public String toString() {
        if (this.imag == 0) return "" + this.real; 
        if (this.real == 0) return (this.imag == 1 ? "" : this.imag) + "i";
        return this.real + (this.imag < 0 ? " - " : " + ") + (Math.abs(this.imag) == 1 ? "" : Math.abs(this.imag)) + "i";
    }

    public ComplexNumber conjugate() {
        return new ComplexNumber(real, -imag);
    }

    public ComplexNumber abs() {
        return new ComplexNumber(Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imag, 2)), 0);
    }

    public ComplexNumber add(ComplexNumber number) {
        return new ComplexNumber(this.real + number.re(), this.imag + number.imag());
    }

    public ComplexNumber sub(ComplexNumber number) {
        return new ComplexNumber(this.real - number.re(), this.imag - number.imag());
    }

    public ComplexNumber mult(ComplexNumber number) {
        return new ComplexNumber(this.real * number.re() - this.imag * number.imag(), this.real * number.imag() + this.imag * number.re());
    }
}

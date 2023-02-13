package Week03.datetime;

public class ComplexNumber {
    private double real;
    private double i;

    public ComplexNumber(double real, double i) {
        this.real = real;
        this.i = i;
    }

    public boolean equals(ComplexNumber number) {
        return this.real == number.real && this.i == number.i;
    }

    public String toString() {
        return this.real + " + " + this.i + "i";
    }

    public double re() {
        return this.real;
    }

    public double i() {
        return this.i;
    }

    public ComplexNumber conjugate() {
        return new ComplexNumber(this.real, -this.i);
    }

    public double abs() {
        return Math.sqrt(this.real * this.real + this.i * this.i);
    }

    public ComplexNumber add(ComplexNumber number) {
        return new ComplexNumber(this.real + number.real, this.i + number.i);
    }

    public ComplexNumber sub(ComplexNumber number) {
        return new ComplexNumber(this.real - number.real, this.i - number.i);
    }

    public ComplexNumber mult(ComplexNumber number) {
        double realPart = this.real * number.real - this.i * number.i;
        double imagPart = this.real * number.i + this.i * number.real;
        return new ComplexNumber(realPart, imagPart);
    }
}

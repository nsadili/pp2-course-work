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
        return "(" + real + " + " + imag + "i)";
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

    public ComplexNumber abs() {
        double magnitude = Math.sqrt(real * real + imag * imag);
        return new ComplexNumber(magnitude, 0);
    }

    public ComplexNumber add(ComplexNumber number) {
        double newReal = real + number.real;
        double newImag = imag + number.imag;
        return new ComplexNumber(newReal, newImag);
    }

    public ComplexNumber sub(ComplexNumber number) {
        double newReal = real - number.real;
        double newImag = imag - number.imag;
        return new ComplexNumber(newReal, newImag);
    }

    public ComplexNumber mult(ComplexNumber number) {
        double newReal = real * number.real - imag * number.imag;
        double newImag = real * number.imag + imag * number.real;
        return new ComplexNumber(newReal, newImag);
    }

    public ComplexNumber pow(int n) {
        double magnitude = Math.pow(abs().re(), n);
        double angle = n * Math.atan2(imag, real);
        double newReal = magnitude * Math.cos(angle);
        double newImag = magnitude * Math.sin(angle);
        return new ComplexNumber(newReal, newImag);
    }
}
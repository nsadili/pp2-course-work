package pp24.week03.math;

public class ComplexNumber {

    private double real;
    private double imag;

    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public boolean equals(ComplexNumber number) {
        return (this.real == number.real) && (this.imag == number.imag);
    }

    public String toString() {
        if (imag >= 0) {
            return real + "+" + imag + "i";
        } else {
            return real + "-" + Math.abs(imag) + "i";
        }
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
        return new ComplexNumber(Math.sqrt(real * real + imag * imag), 0);
    }

    public ComplexNumber add(ComplexNumber number) {
        return new ComplexNumber(real + number.real, imag + number.imag);
    }

    public ComplexNumber sub(ComplexNumber number) {
        return new ComplexNumber(real - number.real, imag - number.imag);
    }

    public ComplexNumber mult(ComplexNumber number) {
        double newReal = real * number.real - imag * number.imag;
        double newImag = imag * number.real + real * number.imag;
        return new ComplexNumber(newReal, newImag);
    }

    public ComplexNumber pow(int n) {
        ComplexNumber result = new ComplexNumber(1, 0);
        for (int i = 0; i < n; i++) {
            result = result.mult(this);
        }
        return result;
    }
}

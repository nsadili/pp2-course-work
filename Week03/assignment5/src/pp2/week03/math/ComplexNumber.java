package pp2.week03.math;

public class ComplexNumber {
    private double real;
    private double imag;

    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public boolean equals(ComplexNumber number) {
        return (real == number.real && imag == number.imag);
    }

    public String toString() {
        if (imag < 0) {
            return real + " - " + (-imag) + "i";
        } else {
            return real + " + " + imag + "i";
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
        double magnitude = Math.sqrt(real * real + imag * imag);
        return new ComplexNumber(magnitude, 0);
    }

    public ComplexNumber add(ComplexNumber number) {
        double realSum = real + number.real;
        double imagSum = imag + number.imag;
        return new ComplexNumber(realSum, imagSum);
    }

    public ComplexNumber sub(ComplexNumber number) {
        double realDiff = real - number.real;
        double imagDiff = imag - number.imag;
        return new ComplexNumber(realDiff, imagDiff);
    }

    public ComplexNumber mult(ComplexNumber number) {
        double realProd = real * number.real - imag * number.imag;
        double imagProd = real * number.imag + imag * number.real;
        return new ComplexNumber(realProd, imagProd);
    }

    public ComplexNumber pow(int n) {
        ComplexNumber result = new ComplexNumber(1, 0);
        for (int i = 0; i < n; i++) {
            result = result.mult(this);
        }
        return result;
    }
}

package Ex05;

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
        if (imag >= 0) {
            return String.format("%.2f + %.2fi", real, imag);
        } else {
            return String.format("%.2f - %.2fi", real, -imag);
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
        return new ComplexNumber(real * number.real - imag * number.imag,
                real * number.imag + imag * number.real);
    }

    public ComplexNumber power(int n) {
        double modulus = Math.pow(abs().re(), n);
        double argument = n * Math.atan2(imag, real);
        return new ComplexNumber(modulus * Math.cos(argument), modulus * Math.sin(argument));
    }
}


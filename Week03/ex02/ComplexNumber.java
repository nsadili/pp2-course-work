public class ComplexNumber {
    private double real;
    private double imag;

    public ComplexNumber(double real, double imag) {
        this.imag = imag;
        this.real = real;
    }

    public boolean equals(ComplexNumber number) {
        if(this.real == number.real && this.imag == number.imag) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return real + "+" + imag + "i";
    }

    public double re() {
        return real;
    }

    public double imag() {
        return imag;
    }

    public ComplexNumber conjugate() {
        return new ComplexNumber(real, - imag);
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
        double realPart = this.real * number.real - this.imag * number.imag;
        double imagPart = this.real * number.imag + this.imag * number.real;
        return new ComplexNumber(realPart, imagPart);
    }
}

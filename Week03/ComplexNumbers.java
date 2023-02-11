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

    public ComplexNumber conjugate() {
        return new ComplexNumber(real, -imag);
    }

    public ComplexNumber abs() {
        return new ComplexNumber(Math.sqrt(real * real + imag * imag), 0);
    }

    public ComplexNumber add(ComplexNumber number) {
        return new ComplexNumber(real + number.getReal(), imag + number.getImag());
    }

    public ComplexNumber sub(ComplexNumber number) {
        return new ComplexNumber(real - number.getReal(), imag - number.getImag());
    }

    public ComplexNumber mult(ComplexNumber number) {
        return new ComplexNumber(real * number.getReal() - imag * number.getImag(),
                real * number.getImag() + imag * number.getReal());
    }

    public ComplexNumber pow(int n) {
        ComplexNumber result = new ComplexNumber(1, 0);
        for (int i = 0; i < n; i++) {
            result = result.mult(this);
        }
        return result;
    }

    public boolean equals(ComplexNumber number) {
        return real == number.getReal() && imag == number.getImag();
    }

    public String toString() {
        return String.format("%.2f + %.2fi", real, imag);
    }
}








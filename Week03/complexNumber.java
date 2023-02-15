package pp2.week3.datetime;

public class complexNumber {
    private double real;
    private double imag;

    public complexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public boolean equals(complexNumber num) {
        return this.real == num.real && this.imag == num.imag;
    }

    

    public double re() {
        return real;
    }

    public complexNumber sub(complexNumber num) {
        return new complexNumber(this.real - num.real, this.imag - num.imag);
    }

    public complexNumber conjugate() {
        return new complexNumber(real, -imag);
    }

    public double imag() {
        return imag;
    }

    

    public double abs() {
        return Math.sqrt(real * real + imag * imag);
    }

    public String toString() {
        return real + " + " + imag + "i";
    }

    public complexNumber add(complexNumber num) {
        return new complexNumber(this.real + num.real, this.imag + num.imag);
    }

    

    public complexNumber mult(complexNumber num) {
        double realPart = this.real * num.real - this.imag * num.imag;
        double imagPart = this.real * num.imag + this.imag * num.real;
        return new complexNumber(realPart, imagPart);
    }
}
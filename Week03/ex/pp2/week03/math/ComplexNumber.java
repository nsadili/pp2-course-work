package pp2.week03.math;

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

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }
    public boolean equals(ComplexNumber number){
        return this.real == number.real && this.imag == number.imag;
    }
    public String toString(){
        return real + "+" + imag + "i";
    } 
    
    public ComplexNumber abs() {
        return new ComplexNumber(Math.sqrt(real * real + imag * imag), 0);
    }
    public double getRe() {
        return real;
    }

    public double getImg() {
        return imag;
    }

    public ComplexNumber conjugate() {
        return new ComplexNumber (real, -imag);
    }

    public ComplexNumber add(ComplexNumber number) {
        return new ComplexNumber(this.real + number.real, this.imag + number.imag);
    }

    public ComplexNumber  subtract(ComplexNumber number) {
        return new ComplexNumber(this.real - number.real, this.imag - number.imag);
    }

    public ComplexNumber multiply(ComplexNumber number) {
        double real = this.real * number.real - this.imag * number.imag;
        double imag = this.real * number.imag + this.imag * number.real;
        return new ComplexNumber(real, imag);
    }
    public String sub(ComplexNumber c2) {
        return null;
    }
}

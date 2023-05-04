
public class ComplexNumber {
    private double real;
    private double imag;
    
    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    
    public boolean equals(ComplexNumber number) {
        if (this.real == number.real && this.imag == number.imag) {
            return true;
        }
        return false;
    }
    
    public String toString() {
        if (imag < 0) {
            return real + " - " + Math.abs(imag) + "i";
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
        double abs = Math.sqrt(real * real + imag * imag);
        return new ComplexNumber(abs, 0);
    }
    
    public ComplexNumber add(ComplexNumber number) {
        double realSum = this.real + number.real;
        double imagSum = this.imag + number.imag;
        return new ComplexNumber(realSum, imagSum);
    }
    
    public ComplexNumber sub(ComplexNumber number) {
        double realDiff = this.real - number.real;
        double imagDiff = this.imag - number.imag;
        return new ComplexNumber(realDiff, imagDiff);
    }
    
    public ComplexNumber mult(ComplexNumber number) {
        double realProd = this.real * number.real - this.imag * number.imag;
        double imagProd = this.real * number.imag + this.imag * number.real;
        return new ComplexNumber(realProd, imagProd);
    }
    
    public ComplexNumber power(int n) {
        double r = Math.pow(abs().re(), n);
        double theta = n * Math.atan2(imag, real);
        double realPower = r * Math.cos(theta);
        double imagPower = r * Math.sin(theta);
        return new ComplexNumber(realPower, imagPower);
    }
}

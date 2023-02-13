package Week03.datetime;

public class ComplexNumber {
    private double r;
    private double i;
    
    public ComplexNumber(double real, double i) {
        this.r = r;
        this.i = i;
    }
    
    public boolean equals(ComplexNumber number) {
        return this.r == number.r && this.i == number.i;
    }
    
    public String toString() {
        return this.r + " + " + this.i + "i";
    }
    
    public double re() {
        return this.r;
    }
    
    public double i() {
        return this.i;
    }
    
    public ComplexNumber conjugate() {
        return new ComplexNumber(this.r, -this.i);
    }
    
    public double abs() {
        return Math.sqrt(this.r * this.r + this.i * this.i);
    }
    
    public ComplexNumber add(ComplexNumber number) {
        return new ComplexNumber(this.r + number.r, this.i + number.i);
    }
    
    public ComplexNumber sub(ComplexNumber number) {
        return new ComplexNumber(this.r - number.r, this.i - number.i);
    }
    
    public ComplexNumber mult(ComplexNumber number) {
        double realPart = this.r * number.r - this.i * number.i;
        double imagPart = this.r * number.i + this.i * number.r;
        return new ComplexNumber(realPart, imagPart);
    }
}

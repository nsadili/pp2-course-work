package pp2.week03.math;

public class ComplexNumber {
    private double x;
    private double y;

    public ComplexNumber() { }

    public ComplexNumber(double x, double y) {
        this.x = x; this.y = y;
    }

    public double getReal() {
        return this.x;
    }

    public double getImaginary() {
        return this.y;
    }

    public void setReal(double x) {
        this.x = x;
    }

    public void setImaginary(double y) {
        this.y = y;
    }

    public boolean equals(ComplexNumber number) {
        return (this.x == number.x) && (this.y == number.y);
    }

    public String toString() {
        if ((int)this.x == this.x && (int)this.y == this.y)
            return (int)this.x + "+" + (int)this. y + "i";
        if ((int)this.x == this.x)
            return (int)this.x + "+" + this. y + "i";
        if ((int)this.y == this.y)
            return this.x + "+" + (int)this. y + "i";
        return this.x + "+" + this. y + "i";
    }

    public double re() {
        return this.x;
    }

    public double imag() {
        return this.y;
    }

    public ComplexNumber conjugate() {
        return new ComplexNumber(this.x, -this.y);
    }

    public ComplexNumber abs() {
        double z = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
        return new ComplexNumber(z, 0);
    }

    public ComplexNumber add(ComplexNumber number) {
        double x = this.x + number.x;
        double y = this.y + number.y;
        return new ComplexNumber(x, y);
    }

    public ComplexNumber sub(ComplexNumber number) {
        double x = this.x - number.x;
        double y = this.y - number.y;
        return new ComplexNumber(x, y);
    }

    public ComplexNumber mult(ComplexNumber number) {
        double x = this.x * number.x - this.y * number.y;
        double y = this.x * number.y + this.y * number.x;
        return new ComplexNumber(x, y);
    }
}
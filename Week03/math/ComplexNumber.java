package Week03.math;

public class ComplexNumber {
    private double x; //real
    private double y; //imag

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public ComplexNumber(double x, double y) {
        setX(x);
        setY(y);
    }

    public boolean equals(ComplexNumber number) {
        if (this.x == number.getX() && this.y == number.getY()) return true;
        else return false;
    }

    public String toString() {
        return getX() + " + " + getY() + "i";
    }

    public double re() {
        return getX();
    }

    public double imag() {
        return getY();
    }

    public ComplexNumber conjugate() {
        return new ComplexNumber(x, -y);
    }

    public double abs(ComplexNumber number) {
        return Math.sqrt(number.x*number.x+number.y*number.y);
    }

    public ComplexNumber add(ComplexNumber number) {
        double newx = this.x + number.re();
        double newy = this.y + number.imag();
        return new ComplexNumber(newx, newy);
    }

    public ComplexNumber sub(ComplexNumber number) {
        double newx = this.x - number.re();
        double newy = this.y - number.imag();
        return new ComplexNumber(newx, newy);
    }

    public ComplexNumber mult(ComplexNumber number) {
        double newx = this.x - number.re();
        double newy = this.y - number.imag();
        return new ComplexNumber(newx, newy);
    }
}

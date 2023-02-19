package pp2.week03.math;

public class ComplexNumber {
    private double x;
    private double y;

    public ComplexNumber() {
        this.x = 0;
        this.y = 0;
    }
    public ComplexNumber(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public ComplexNumber(ComplexNumber number) {
        this.x = number.getX();
        this.y = number.getY();
    }

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

    public boolean equals(ComplexNumber number) {
        return this.x == number.getX() && this.y == number.getY();
    }

    public String toString() {
        String sign = "+";
        if(this.y < 0)
            sign = "";
        return "(" + this.x + sign + this.y + "i)";
    }

    public double re() {
        return this.x;
    }

    public double imag() {
        return this.y;
    }

    public ComplexNumber conjugate() {
        ComplexNumber result = new ComplexNumber(this.x, -this.y);
        return result;
    }

    public double abs() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public ComplexNumber add(ComplexNumber number) {
        ComplexNumber result = new ComplexNumber();
        result.setX(this.x + number.getX());
        result.setY(this.y + number.getY());
        return result;
    }

    public ComplexNumber sub(ComplexNumber number) {
        ComplexNumber result = new ComplexNumber();
        result.setX(this.x - number.getX());
        result.setY(this.y - number.getY());
        return result;
    }

    public ComplexNumber mult(ComplexNumber number) {
        ComplexNumber result = new ComplexNumber();
        result.setX(this.x * number.getX() - this.y * number.getY());
        result.setY(this.x * number.getY() + this.y * number.getX());
        return result;
    }
}

package math;

public class ComplexNumber {
    double x;
    double y;
    public ComplexNumber(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public boolean equal(ComplexNumber num) {
        if(this.x == num.x && this.y == num.y) {
            return true;
        }
        return false;
    }
    public double re() {
        return this.x;
    }
    public double imag() {
        return this.y;
    }
    public String conjugate() {
        return x+" - "+y+"i";
    }
    public double abs() {
        return Math.sqrt(this.x*this.x + this.y*this.y);
    }
    public String add(ComplexNumber num) {
        return (this.x+num.x)+" + "+(this.y+num.y)+"i";
    }
    public String sub(ComplexNumber num) {
        return (this.x-num.x)+" + "+(this.y-num.y)+"i";
    }
    public String mult(ComplexNumber num) {
        return (this.x*num.x - this.y*num.y)+" + "+(this.y*num.x -this.x*num.y)+"i";
    }
    


    @Override
    public String toString() {
        return x+" + "+y+"i";
    }
}

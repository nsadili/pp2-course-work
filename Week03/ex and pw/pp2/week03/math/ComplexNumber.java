package pp2.week03.math;

public class ComplexNumber {
    private double real;
    private double imagin;

    public ComplexNumber(double real, double imagin) {
        this.real = real;
        this.imagin = imagin;
    }

    public boolean equals(ComplexNumber number) {
        if (this.real == number.real && this.imagin == number.imagin)
            return true;
        else
            return false;
    }

    public String toString() {
        return this.real + "+" + this.imagin + "i";
    }

    public double re() {
        return this.real;

    }

    public double imagin() {
        return this.imagin;
    }
public ComplexNumber conjug(){
    return new ComplexNumber(this.real, -this.imagin);

}    public double abs() {
        return Math.sqrt(this.real * this.real + this.imagin * this.imagin);
    }

    public ComplexNumber add(ComplexNumber number) {
        return new ComplexNumber(this.real + number.real, this.imagin + number.imagin);
    }

    public ComplexNumber sub(ComplexNumber number) {
        return new ComplexNumber(this.real - number.real, this.imagin - number.imagin);
    }

    public ComplexNumber mult(ComplexNumber number) {
        return new ComplexNumber(this.real * number.real - number.imagin * this.imagin,
                this.real * number.imagin - number.real * this.imagin);
    }
}

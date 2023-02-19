package pp2.week03.math;

public class ComplexNumber {

    private double real;
    private double imag;

    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }



    public boolean equals(ComplexNumber number) {
        return (this.real == number.real && this.imag == number.imag);
    }



    public String toString() {
        return "(" + this.real + " + " + this.imag + "i)";

    }


    public double re() {

        return this.real;

    }



    public double imag() {

        
        return this.imag;


    }



    public ComplexNumber conjugate() {


        return new ComplexNumber(this.real, -this.imag);

    }

    public ComplexNumber abs() {


        return new ComplexNumber(Math.sqrt(this.real * this.real + this.imag * this.imag), 0);


    }

    public ComplexNumber add(ComplexNumber number) {


        return new ComplexNumber(this.real + number.real, this.imag + number.imag);


    }

    public ComplexNumber sub(ComplexNumber number) {


        return new ComplexNumber(this.real - number.real, this.imag - number.imag);


    }

    public ComplexNumber mult(ComplexNumber number) {


        double newReal = this.real * number.real - this.imag * number.imag;
        double newImag = this.real * number.imag + this.imag * number.real;
        return new ComplexNumber(newReal, newImag);


    }

    public ComplexNumber pow(int n) {


        if (n == 0) {
            return new ComplexNumber(1, 0);
        } else if (n == 1) {
            return this;
        } else {
            ComplexNumber result = this;
            for (int i = 1; i < n; i++) {
                result = result.mult(this);
            }
            return result;

            
        }
    }
}

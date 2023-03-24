package pp2.week03.math;

public class ComplexNumber {
  private double real;
  private double imag;

  public ComplexNumber(double real, double imag) {
    this.real = real;
    this.imag = imag;
  }

  public boolean equals(ComplexNumber number) {
    return this.real == number.real && this.imag == number.imag;
  }

  public String toString() {
    return real + " + " + imag + "i";
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
    return new ComplexNumber(Math.sqrt(real*real + imag*imag), 0);
  }

  public ComplexNumber add(ComplexNumber number) {
    return new ComplexNumber(this.real + number.real, this.imag + number.imag);
  }

  public ComplexNumber sub(ComplexNumber number) {
    return new ComplexNumber(this.real - number.real, this.imag - number.imag);
  }

  public ComplexNumber mult(ComplexNumber number) {
    double realPart = this.real * number.real - this.imag * number.imag;
    double imagPart = this.real * number.imag + this.imag * number.real;
    return new ComplexNumber(realPart, imagPart);
  }
}

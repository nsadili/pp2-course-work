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

  public double abs() {
    return Math.sqrt(real * real + imag * imag);
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

class ComplexTest {
  public static void main(String[] args) {
    ComplexNumber c1 = new ComplexNumber(3, 4);
    ComplexNumber c2 = new ComplexNumber(2, -1);
    ComplexNumber c3 = new ComplexNumber(3, 4);

    System.out.println("c1 = " + c1);
    System.out.println("c2 = " + c2);
    System.out.println("c3 = " + c3);
    System.out.println();

    System.out.println("c1.equals(c2) = " + c1.equals(c2));
    System.out.println("c1.equals(c3) = " + c1.equals(c3));
    System.out.println();

    System.out.println("c1.re() = " + c1.re());
    System.out.println("c1.imag() = " + c1.imag());
    System.out.println();

    System.out.println("c1.conjugate() = " + c1.conjugate());
    System.out.println("c1.abs() = " + c1.abs());
    System.out.println();

    System.out.println("c1.add(c2) = " + c1.add(c2));
    System.out.println("c1.sub(c2) = " + c1.sub(c2));
    System.out.println("c1.mult(c2) = " + c1.mult(c2));
    System.out.println();

    int n = 3;
    ComplexNumber cn = c1;
    for (int i = 1; i < n; i++) {
      cn = cn.mult(c1);
    }
    System.out.println("c1^3 = " + cn);
  }
}

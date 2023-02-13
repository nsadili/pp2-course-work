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
      return this.real + " + " + this.imag + "i";
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
  
    public double abs() {
      return Math.sqrt(this.real * this.real + this.imag * this.imag);
    }
  
    public ComplexNumber add(ComplexNumber number) {
      return new ComplexNumber(this.real + number.real, this.imag + number.imag);
    }
  
    public ComplexNumber sub(ComplexNumber number) {
      return new ComplexNumber(this.real - number.real, this.imag - number.imag);
    }
  
    public ComplexNumber mult(ComplexNumber number) {
      double real = this.real * number.real - this.imag * number.imag;
      double imag = this.real * number.imag + this.imag * number.real;
      return new ComplexNumber(real, imag);
    }
  }
  
  public class ComplexTest {
      public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3, 4);
        ComplexNumber c2 = new ComplexNumber(3, 4);
        ComplexNumber c3 = new ComplexNumber(4, 5);
    
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("c3: " + c3);
    
        System.out.println("c1 is equal to c2: " + c1.equals(c2));
        System.out.println("c1 is equal to c3: " + c1.equals(c3));
    
        System.out.println("c1 real part: " + c1.re());
        System.out.println("c1 imaginary part: " + c1.imag());
    
        System.out.println("c1 conjugate: " + c1.conjugate());
        System.out.println("c1 absolute value: " + c1.abs());
    
        System.out.println("c1 + c2: " + c1.add(c2));
        System.out.println("c1 - c2: " + c1.sub(c2));
        System.out.println("c1 * c2: " + c1.mult(c2));
      }
    }
    
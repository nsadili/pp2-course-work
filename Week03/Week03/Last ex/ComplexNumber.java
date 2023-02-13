public class ComplexNumber {
    private double real;
    private double imag;
    public ComplexNumber(double real, double imag){
        this.real = real;
        this.imag = imag;
    }
    public boolean equals(ComplexNumber number){
        return this.real == number.real && this.imag == number.imag;
    }
    public String toString(){
        return real + " + " + imag + "i";
    }
    public double re(){
        return real;
    }
    public double imag(){
        return imag;
    }
    public ComplexNumber conjugate(){
        return new ComplexNumber(real, -imag);
    }
    public double abs(){
        return Math.sqrt(real * real + imag * imag);
    }
    public ComplexNumber add(ComplexNumber number){
        return new ComplexNumber(real + number.real, imag + number.imag);
    }
    public ComplexNumber sub(ComplexNumber number){
        return new ComplexNumber(real - number.real, imag - number.imag);
    }
    public ComplexNumber mult(ComplexNumber number){
        return new ComplexNumber(real * number.real, imag * number.imag);
    }

}
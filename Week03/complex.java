public class complex {
    private double real;
    private double imag;

    public complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }
    public boolean equals(complex number){
        return this.real == number.real && this.imag == number.imag;
    }
    public String toString(){
        return real + "+" + imag + "i";
    } 
    
    public complex abs() {
        return new complex(Math.sqrt(real * real + imag * imag), 0);
    }
    public double getRe() {
        return real;
    }

    public double getImg() {
        return imag;
    }

    public complex conjugate() {
        return new complex (real, -imag);
    }

    public complex add(complex number) {
        return new complex(this.real + number.real, this.imag + number.imag);
    }

    public complex  subtract(complex number) {
        return new complex(this.real - number.real, this.imag - number.imag);
    }

    public complex multiply(complex number) {
        double real = this.real * number.real - this.imag * number.imag;
        double imag = this.real * number.imag + this.imag * number.real;
        return new complex(real, imag);
    }
    public String sub(complex c2) {
        return null;
    }
}
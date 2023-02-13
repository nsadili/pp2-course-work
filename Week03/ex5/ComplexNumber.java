public class ComplexNumber {
    
    private double real;
    private double imag;
    private double abs;

    public ComplexNumber(double real, double imag) {
        this.real=real;
        this.imag=imag;
    }

    public ComplexNumber(double abs) {
        this.abs=abs;
    }

    public double re() {
        return this.real;
    }

    public void setReal(double real) {
        this.real=real;
    }

    public double imag() {
        return this.imag;
    }

    public void setImag(double imag) {
        this.imag=imag;
    }

    public double getAbs() {
        return this.abs;
    }

    public boolean equals(ComplexNumber number) {
        if(this.real==number.re() & this.imag==number.imag()) return true;
        else return false;
    }

    public String toString() {
        if(this.imag>0) System.out.printf("%f + %fi\n",this.real,this.imag);
        else System.out.printf("%f - %fi\n",this.real,this.imag*(-1));
        return "\n";
    }

    public ComplexNumber conjugate() {
        if(this.imag>0) {
            //System.out.printf("%f - %fi\n",this.real,this.imag);
            ComplexNumber conj=new ComplexNumber(this.real, this.imag);
            return conj;
        }
        else {
            //System.out.printf("%f + %fi\n",this.real,this.imag*(-1));
            ComplexNumber conj=new ComplexNumber(this.real, this.imag*(-1));
        }
    }

    public ComplexNumber abs() {
        ComplexNumber absolute=new ComplexNumber(Math.sqrt(Math.pow(this.real, 2)+ Math.pow(this.imag, 2)));
        return absolute;
    }

}
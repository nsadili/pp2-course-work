public class ComplexNumber {
 
    private double real;
    private double imag;

    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    
    public boolean equals(ComplexNumber number){
        if(this.real == number.real && this.imag == number.imag){
            return true;
        }
        else{
            return false;
        }
    }

    public String toString(){
        if(this.real == 0 && this.imag == 0){
            return "0";
        }
        else if(this.imag == 0){
            return String.format("%.2f", this.real);
        }
        else if(this.real == 0){
            return String.format("%.2fi", this.imag);
        }
        else if(this.imag < 0){
            return String.format("%.2f%.2fi", this.real,this.imag);
        }
        else{
            return String.format("%.2f + %.2fi", this.real,this.imag);
        }  
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
        return new ComplexNumber(Math.sqrt(real * real + imag * imag),0);
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

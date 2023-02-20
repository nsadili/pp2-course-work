package pp2.week03.math;

public class ComplexNumber {
    private static double ABS;
    private double x; //- real part of the complex number
    private double y; // - imaginary part of the number both of type float or double.


    public ComplexNumber(double x, double y){
        this.x=x;
        this.y=y;
    }

    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }

    public boolean equals(ComplexNumber number){
        if (this.x==number.x && this.y==number.y) return true; else return false;
    }

    public String toString(){
        return this.x + " + " + this.y + "i";
    }

    public double re(){
        return this.x;
    }

    public double imag(){
        return this.y;
    }

    public void conjugate(){
        this.y=-this.y;
    }

    public double abs(){
        ABS = Math.sqrt(this.x*this.x + this.y*this.y);
        return ComplexNumber.ABS;
    }

    public ComplexNumber add(ComplexNumber number){   
        double newX = this.x+number.x;
        double newY = this.y+number.y;
        return new ComplexNumber(newX,newY);
    }
    public ComplexNumber sub(ComplexNumber number){
        double newX = this.x-number.x;
        double newY = this.x-number.y;
        return new ComplexNumber(newX, newY);
    }
    public ComplexNumber mult(ComplexNumber number){  
        double newX = this.x*number.x;
        double newY = this.y*number.y;
        return new ComplexNumber(newX,newY);
    }
    }

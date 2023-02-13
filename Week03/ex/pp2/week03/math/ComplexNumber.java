package pp2.week03.math;

public class ComplexNumber {
    private double x;
    private double y;
    private static double abs;

    public ComplexNumber (double x, double y){
        this.x=x;
        this.y=y;
    }
    

    public double getX() {
        return x;
    }


    public double getY() {
        return y;
    }


    public static double getAbs() {
        return abs;
    }


    public boolean equals (ComplexNumber n){
        if (this.x==n.x && this.y==n.y) return true;
         else return false;
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
        abs = Math.sqrt(this.x*this.x + this.y*this.y);

        return ComplexNumber.abs;
    }

    public ComplexNumber add(ComplexNumber n){   
        double newX = this.x+n.x;
        double newY = this.y+n.y; 

        return new ComplexNumber(newX,newY);
    }

    public ComplexNumber sub(ComplexNumber n){
        double newX = this.x-n.x;
        double newY = this.x-n.y;

        return new ComplexNumber(newX, newY);
    }
     
    public ComplexNumber mult(ComplexNumber n){  
        double xx=this.x * n.x;
        double yy=this.y * n.y;

        return new ComplexNumber(xx,yy);
    }

}

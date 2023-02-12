package pp2.week3.math;

public class ComplexNumber {

    // x+yi

    private double real;
    private double img;

    public ComplexNumber(double real, double img) {
        this.real = real;
        this.img = img;

    }

    
    public double re() {
        return this.real;
    }

    public double img() {
        return this.img;
    }

    public String toString(){

        return String.format("%.2f + %.2fi",this.real,this.img);

    }

    public ComplexNumber conjugate() {
        return new ComplexNumber(real, -1 * img);
    }

    public ComplexNumber abs2() {
        // this method return absoluete value by mathematical perspective: it finds absoluete value of complex number
        
        return new ComplexNumber(Math.hypot(real, img), 0);
    }

    public ComplexNumber abs() {
        // this method find only absoluete values of real and imaginative parts.
        return new ComplexNumber(Math.abs(real), Math.abs(img));
    }

    public boolean equals(ComplexNumber number) {
        return (this.real == number.real && this.img == number.img);
    }


    public ComplexNumber add(ComplexNumber number) {

        return new ComplexNumber(this.real + number.real, this.img + number.img);

    }

    public ComplexNumber  mult(ComplexNumber number){

        return new ComplexNumber((this.real*number.real)-(this.img*number.img), (this.real*number.img)+(this.img*number.real));

    }

  

    public ComplexNumber sub(ComplexNumber number) {

        return new ComplexNumber(this.real - number.real, this.img - number.img);

    }

    public static  void exp(double x,double y, int n){

        // this method find a exponentation of complex number by using a trigonometric formula
        // it is easy to find exponenentation in trigonemetric formula of complex number
        // trigonemetric formula: z= r*(cos(angle)+i*sin(angle))  -- r is a module of complex number
   
                var r= Math.hypot(x,y);

               double angle;

               if(x>=0 && y>=0){

                angle= Math.atan(y/x);

               }else if(x<0 && y>=0){

                angle=Math.PI-Math.atan(y/x);

               }else if(x<0 && y<0){

                angle=Math.PI+Math.atan(y/x);
            

               }else{

                angle= 2*Math.PI-Math.atan(y/x);

               }

               // we found angle for different cases

               var realCopy=Math.pow(r, n)* Math.cos(angle*n);
               var imgCopy= Math.pow(r, n)* Math.sin(angle*n);

               System.out.printf("%.2f , %.2f", realCopy,imgCopy);


    }

  
   

    

}

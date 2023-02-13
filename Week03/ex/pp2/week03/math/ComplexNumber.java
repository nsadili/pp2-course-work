package pp2.week03.math;



public class ComplexNumber {
    private double x;
    private double y;
    

public ComplexNumber(double x, double y){
    this.x=x;
    this.y=y;
}
public double getX(){
    return x;
}
public void setX(double x){
    this.x=x;
}
public double getY(){
    return y;
}
public void setY(double y){
    this.y=y;
}
public boolean equals(ComplexNumber number){
    return this.x == number.x && this.y==number.y;
}
public String toString(){
    if(this.y>0){
    
    return String.format("%.2f+ %.2fi", this.x, this.y);
    } return String.format("%.2f - %.2fi", this.x, Math.abs(y));
}
public double re(){
    return this.x;
}
public double imag(){
    return this.y;

}
public ComplexNumber conjugate (){
    return new ComplexNumber(x, -1*y);
}
public ComplexNumber abs(){
    return new ComplexNumber(Math.abs(x), Math.abs(y));

}
/*  It only takes absolute values. For example
   -5-6i = 5+6i
*/
public ComplexNumber add(ComplexNumber number){
     
     return new ComplexNumber(this.x+number.x, this.y + number.y);
}
public ComplexNumber sub(ComplexNumber number){
   
    return new ComplexNumber(this.x- number.x, this.y-number.y);
}
public ComplexNumber mult(ComplexNumber number){
   return new ComplexNumber((this.x*number.x)-(this.y*number.y),(this.y*number.x)+(this.y*number.y));
}
 public ComplexNumber exponentiate(int n){
    double magnitude= Math.pow(abs2(), n);
    double angle = n*arg();
    return new ComplexNumber(magnitude* Math.cos(angle), magnitude *Math.sin(angle));
 }
 public double arg(){
    return Math.atan2(y, x);
 }
 public double abs2(){
    return Math.sqrt(x*x+y*y);
 }
/* Exponentiation: given a complex number c and n by user find out the value of cn.
More Information: https://www.nagwa.com/en/explainers/464129159632/
*/
}

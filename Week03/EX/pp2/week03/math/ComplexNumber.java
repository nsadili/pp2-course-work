package pp2.week03.math;
    
public class ComplexNumber{
private double x; //real
private double y; //imag  

public ComplexNumber(double x,double y){
this.x=x;
this.y=y;
}

public double getX() {
    return x;
}

public double getY() {
    return y;
}

public boolean equals(ComplexNumber number){
if(this.x==number.x && this.y==number.y) return true;
else return false;
}
public String toString(){

return String.format("Complex Number: %.2f%s%.2fi",x,(y>0?"+":"-"),(y>0?y:-y));

}
public double re(){
    return this.x;
}
public double imag(){
    return this.y;
}
public ComplexNumber conjugate() {
    return new ComplexNumber(x, -y);
  }
public String abs(){
   
    if(x<0) x=-x;
    return String.format("Absolute: %.2f%s%.2fi",x,"+",(y>0?y:-y));
}
public String add(ComplexNumber number)
{
    double resx =this.x+number.x;
    double resy =this.y+number.y;
   
    return String.format("Sum: %.2f%s%.2fi",resx,(y>0?"+":"="),(resy>0?resy:-resy));
}

  public ComplexNumber subtract(ComplexNumber other) {
    return new ComplexNumber(x - other.x, y - other.y);
  }
public ComplexNumber mult(ComplexNumber number) {
    double real= this.x*number.x+this.y*number.y;
    double imag= this.x*number.y+ this.y*number.x;
    return new ComplexNumber(real, imag);
}
}
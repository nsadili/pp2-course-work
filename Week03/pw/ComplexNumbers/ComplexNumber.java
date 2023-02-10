package ComplexNumbers;

public class ComplexNumber {
    //x + yi
    private double x,y;

    ComplexNumber(double x, double y){
        this.x = x;
        this.y = y;
    }

    boolean equals(ComplexNumber num){
        if(this == num){
            return true;
        }else{
            return false;
        }
    }

    String tostring(){
        return String.format("%f + %fi", this.x, this,y);
    }

    double re(){
        return this.x;
    }

    double imag(){
        return this.y;
    }

    ComplexNumber conjugate(){
        ComplexNumber newNum = new ComplexNumber(this.x, -this.y);
        return newNum;
    }

    ComplexNumber abs(){   
        ComplexNumber newNum = new ComplexNumber(Math.abs(this.x), Math.abs(this.y));
        return newNum;
    }

    ComplexNumber add(ComplexNumber num){
        ComplexNumber newNum = new ComplexNumber(this.x + num.x, this.y + num.y);
        return newNum;
    }

    ComplexNumber sub(ComplexNumber num){
        ComplexNumber newNum = new ComplexNumber(this.x - num.x, this.y - num.y);
        return newNum;
    }

    ComplexNumber mult(ComplexNumber num){
        ComplexNumber newNum = new ComplexNumber(this.x*num.x - this.y*num.y, this.x*num.y + this.y*num.x);
        return newNum;
    }

    ComplexNumber expo(ComplexNumber num, int n){
        ComplexNumber newNum = new ComplexNumber(num.x, num.y);
        while(n>1){
            newNum.x = newNum.x*num.x - newNum.y*num.y;
            newNum.y = newNum.x*num.y + newNum.y*num.x;
        }
        return newNum;
    }
}

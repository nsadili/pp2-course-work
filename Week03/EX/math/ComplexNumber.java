package EX.math;

public class ComplexNumber {
    float x;
    float y;

    // setters and getters
    public ComplexNumber (float x, float y){
        this.setX(x);
        this.setY(y);
    }
    public void setX(float x){
        this.x = x;
    }
    public void setY(float y){
        this.y = y;
    }
    public float getX(){
        return this.x;
    }
    public float getY(){
        return this.y;
    }

    // methods
    public boolean equals(ComplexNumber number){
        if (number == null){
            return false;
        }
        return this.x == number.x && this.y == number.y;
    }
    public String toString(float x, float y){
        return String.format("%.2f %s %.2f x i", x, (y < 0 ? "-" : "+"), (y < 0 ? -y : y));
    }
    public float re(){
        return this.x;
    }
    public float imag(){
        return this.y;
    }
    public ComplexNumber conjugate(){
        return new ComplexNumber(this.x, -this.y);
    }
    public ComplexNumber abs(){
        return new ComplexNumber(Math.abs(this.x), Math.abs(this.y));
    }
    public ComplexNumber add(ComplexNumber number){
        return new ComplexNumber(this.x + number.x, this.y + number.y);
    }
    public ComplexNumber sub(ComplexNumber number){
        return new ComplexNumber(this.x - number.x, this.y - number.y);
    }
    public ComplexNumber mult(ComplexNumber number){
        return new ComplexNumber(this.x * number.x - this.y * number.y, this.x * number.y + this.y * number.x);
    }
}
package pp2.week03.math;

public class ComplexNumber {
    private double x; //real
    private double y; //imaginary

    public ComplexNumber(double x, double y){
        this.x = x;
        this.y = y;
    }

    public boolean equals(ComplexNumber number){
         if((this.x == number.x) && (this.y == number.y)) {
             return true;
         } else{
             return false;
         }
    }

    public String toString(){
        return this.x + "+" + this.y + "i";
    }
    public double re(){
        return this.x;
    }

    public double imagin(){
        return this.y;
    }

    public ComplexNumber conjug(){
        return new ComplexNumber(this.x, -this.y);
    }

    public double abs(){
        return Math.sqrt(this.x * this.y + this.imagin() * this.imagin());
    }

    public ComplexNumber add(ComplexNumber number){
        return new ComplexNumber(this.x + number.x, this.y * this.x);
    }

    public ComplexNumber sub(ComplexNumber number){
        return new ComplexNumber(this.x - number.x, this.y - number.y);
    }

    public ComplexNumber multiply(ComplexNumber number){
        return new ComplexNumber(this.x * number.x - number.y * this.y, this.x * number.y - number.x + this.y);
    }
  
}

//TEST OF COMPLEX NUMBERS

package pp2.week03.math;

public class Main {
    public static void main(String[] args) {
        ComplexNumber first = new ComplexNumber(3, 5);
        ComplexNumber second = new ComplexNumber(4, 6);
        System.out.println("The first one : " + first);
        System.out.println(first.add(second));
        System.out.println(first.sub(second));
        System.out.println(first.multiply(second));
        System.out.println(second.conjug());
        System.out.println(first.equals(second));


    }
}


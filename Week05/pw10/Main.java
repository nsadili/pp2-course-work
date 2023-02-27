package Week05.pw10;

class point extends Week04.pw16.Point {
    public String toString(){
        super.toString();
        return String.format("x = %.2f, y = %.2f", getX(), getY());
    }
    public String equals(point p){
        super.equals(p);
        if (p.getX() == this.getX() && p.getY() == this.getY()) 
            return "p1 equals to p2";
        return "p1 not equals to p2";
    }
}

public class Main {
    public static void main(String[] args) {
        point p1 = new point();
        point p2 = new point();
        p1.setPoint(4, 5);
        p2.setPoint(1, 6);
        System.out.print(p1.toString() + "\n");
        System.out.print(p2.toString() + "\n");
    }
}
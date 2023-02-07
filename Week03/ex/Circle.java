public class Circle {

    double length;
    double radius;

    Circle(double initiallength, double initialradius) {    /*Constructor*/
        length = initiallength;
        radius = initialradius;
    }

    public static void main(String[] args) {
        
        Circle c1 = new Circle(5, 3);
        System.out.println(c1.length);
        System.out.println(c1.radius);

    }
}

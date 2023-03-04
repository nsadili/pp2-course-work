package geometry.others;

import geometry.figures.Circle;

public class Arrays {
    public static void main(String[] args) {
        Object[] array = new Object[4];
        Point p1 = new Point(5, 9);
        Point p2 = new Point(7, 2);
        Circle c = new Circle();
        Segment s = new Segment(p1, p2);
        array[0] = p1;
        array[1] = p2;
        array[2] = c;
        array[3] = s;
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}

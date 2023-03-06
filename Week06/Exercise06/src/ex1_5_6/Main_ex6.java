package ex1_5_6;

public class Main_ex6 {
    public static void main(String args[]) {
        Point p1 = new Point(4, 6);
        Point p2 = new Point(7, 9);
        System.out.println(p2.toString());
        p2.moveDown();
        System.out.println(p2.toString());
        System.out.println();

        Segment s1 = new Segment(p1, p2);
        System.out.println(s1);
        s1.moveLeft(); s1.moveUp();
        System.out.println(s1);
        System.out.println();

        Circle c1 = new Circle(5, p1);
        System.out.println(c1.toString());
        c1.moveDown(); c1.moveRight();
        System.out.println(c1.toString());
        System.out.println();
        System.out.println();

        Object arr[] = {p1, p2, s1, c1};
        moveUp(arr);
        toString(arr);
    }

    public static Object[] moveUp(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Point)
                ((Point) arr[i]).moveUp();
            else if (arr[i] instanceof Segment)
                ((Segment) arr[i]).moveUp();
            else if (arr[i] instanceof Circle)
                ((Circle) arr[i]).moveUp();
        }
        return arr;
    }

    public static Object[] moveDown(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Point)
                ((Point) arr[i]).moveDown();
            else if (arr[i] instanceof Segment)
                ((Segment) arr[i]).moveDown();
            else if (arr[i] instanceof Circle)
                ((Circle) arr[i]).moveDown();
        }
        return arr;
    }

    public static Object[] moveLeft(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Point)
                ((Point) arr[i]).moveLeft();
            else if (arr[i] instanceof Segment)
                ((Segment) arr[i]).moveLeft();
            else if (arr[i] instanceof Circle)
                ((Circle) arr[i]).moveLeft();
        }
        return arr;
    }

    public static Object[] moveRight(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Point)
                ((Point) arr[i]).moveRight();
            else if (arr[i] instanceof Segment)
                ((Segment) arr[i]).moveRight();
            else if (arr[i] instanceof Circle)
                ((Circle) arr[i]).moveRight();
        }
        return arr;
    }

    public static void toString(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Point)
                System.out.println(((Point) arr[i]).toString());
            else if (arr[i] instanceof Segment)
                System.out.println(((Segment) arr[i]).toString());
            else if (arr[i] instanceof Circle)
                System.out.println(((Circle) arr[i]).toString());
        }
    }
}

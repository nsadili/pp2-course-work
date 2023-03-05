import java.util.Scanner;

public class TestPointAndSegment {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Point p1 = new Point(2, 5);
        // Point p2 = new Point(3, 4);
        // Segment s = new Segment(p1, p2);

        // Circle c = new Circle(p2, 5);
        // System.out.println(c);

        // c.moveDown(3).moveRight(1);
        // System.out.println(c);

        // Movable[] arr={p1,p2,s,c};

        // moveAllPoints(arr, 2);

        // for(Movable m : arr){
        // System.out.println(m);
        // }

        // p1.moveRight(3).moveDown(2).moveLeft(1);
        // System.out.println(p1);

        // System.out.println("Before: " + s);
        // s.moveRight(3).moveDown(1);
        // System.out.println("After: "+ s);

        // Segment s = new Segment(p1, p2);
        // Segment s2=new Segment(2,5,2,5);

        // Point copy1= (Point) p1.clone();
        // System.out.println(copy1);
        // copy1.setX(0);
        // copy1.setY(22);
        // System.out.println(copy1.toString() + ", Point p1:" + p1);

        // Segment scopy= (Segment) s.clone();
        // System.out.println(scopy + ", S: " + s2);

        // s.getP1().setX(66);
        // scopy.setP1(new Point(19,19));
        // System.out.println(scopy +", " + s2);
        // System.out.println(s.getP1());
        // System.out.println(scopy.getP1());

        // System.out.println(p1.equals(p2));
        // System.out.println(p1 == p2);
        // System.out.println(p2);

        // Segment s=new Segment(p1, p2);
        // System.out.println(s.toString());

        // Segment s2=new Segment(2,5,2,5);
        // System.out.println(s.equals(s2));

        // Point p2 = (Point) p1.clone();

        // System.out.println(p1.getX() + ", " + p1.getY());
        // System.out.println(p2.getX() + ", " + p2.getY());

        // System.out.println(p1 == p2);
        // System.out.println(p1.equals(p2));

    }

    public static void moveAllPoints(Movable[] arr, int steps) {

        // Scanner sc=new Scanner(System.in);
        // int steps;
        // System.out.println("Enter the steps: ");
        // steps=sc.nextInt();

        int choice = 1; // 1 up , 2 down , 3 right, 4 left

        for (Movable m : arr) {
            switch (choice) {
                case 1:
                    m.moveUp(steps);
                    break;

                case 2:
                    m.moveDown(steps);
                    break;

                case 3:
                    m.moveRight(steps);
                    break;

                case 4:
                    m.moveLeft(steps);
                    break;

            }
        }

    }
}

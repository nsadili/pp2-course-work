package Week06;

public class Ex6 {
    public interface Movable {
        void moveUp();
        void moveDown();
        void moveLeft();
        void moveRight();
    }

    public static class Point implements Movable {
        public Point(int x, int y) {
        }
    
        public void moveUp() {
        }
    
        public void moveDown() {
        }
    
        public void moveLeft() {
        }
    
        public void moveRight() {
        }
    }

    public static class Segment implements Movable {
        private Point start;
        private Point end;
    
        public Segment(Point start, Point end) {
            this.start = start;
            this.end = end;
        }
    
        public void moveUp() {
            start.moveUp();
            end.moveUp();
        }
    
        public void moveDown() {
            start.moveDown();
            end.moveDown();
        }
    
        public void moveLeft() {
            start.moveLeft();
            end.moveLeft();
        }
    
        public void moveRight() {
            start.moveRight();
            end.moveRight();
        }
    }
    
    public static class Circle implements Movable {
        private Point center;
        private double radius;
    
        public Circle(Point center, double radius) {
            this.center = center;
            this.radius = radius;
        }
    
        public void moveUp() {
            center.moveUp();
        }
    
        public void moveDown() {
            center.moveDown();
        }
    
        public void moveLeft() {
            center.moveLeft();
        }
    
        public void moveRight() {
            center.moveRight();
        }
    }
    
    public static void main(String[] args) {
        Point p = new Point(1, 1);
        p.moveUp(); 
        p.moveLeft(); 

        Segment s = new Segment(new Point(0, 0), new Point(3, 4));
        s.moveDown(); 

        Circle c = new Circle(new Point(2, 2), 1.5);
        c.moveRight(); 

        Movable[] movables = new Movable[] {
            new Point(1, 2),
            new Segment(new Point(0, 0), new Point(1, 1)),
            new Circle(new Point(3, 3), 2.0)
        };

        moveAllRight(movables);
    }

    public static void moveAllRight(Movable[] movables) {
        for (Movable movable : movables) {
            movable.moveRight();
        }
    }

    public class Main {
        public static void main(String[] args) {
            Point p = new Point(1, 1);
            System.out.println(p); 
            p.moveUp(); 
            System.out.println(p); 
            p.moveLeft();
            System.out.println(p); 
    
         
            Segment s = new Segment(new Point(0, 0), new Point(3, 4));
            System.out.println(s); 
            s.moveDown();
            System.out.println(s); 
    
       
            Circle c = new Circle(new Point(2, 2), 1.5);
            System.out.println(c); 
            c.moveRight();
            System.out.println(c); 
     
            Movable[] movables = new Movable[] {
                new Point(1, 2),
                new Segment(new Point(0, 0), new Point(1, 1)),
                new Circle(new Point(3, 3), 2.0)
            };
    
            moveAllRight(movables);
            for (Movable movable : movables) {
                System.out.println(movable);
            }
        }
    
        public static void moveAllRight(Movable[] movables) {
            for (Movable movable : movables) {
                movable.moveRight();
            }
        }
    }
    
}


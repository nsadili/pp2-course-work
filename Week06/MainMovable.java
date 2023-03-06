package Week06;

public class Main {
    
        public static void main(String[] args) {
            
            Point p = new Point(0, 0);
            System.out.println(p.getX() + "," + p.getY()); // 0,0
            p.moveRight();
            System.out.println(p.getX() + "," + p.getY()); // 1,0
            p.moveDown();
            System.out.println(p.getX() + "," + p.getY()); // 1,1
    
       
            Segment s = new Segment(new Point(0, 0), new Point(1, 1));
            System.out.println(s.getStart().getX() + "," + s.getStart().getY()); // 0,0
            System.out.println(s.getEnd().getX() + "," + s.getEnd().getY()); // 1,1
            s.moveUp();
            System.out.println(s.getStart().getX() + "," + s.getStart().getY()); // 0,-1
            System.out.println(s.getEnd().getX() + "," + s.getEnd().getY()); // 1,0
    

            Circle c = new Circle(new Point(0, 0), 5);
            System.out.println(c.getCenter().getX() + "," + c.getCenter().getY()); // 0,0
            c.moveRight();
            System.out.println(c.getCenter().getX() + "," + c.getCenter().getY()); // 1,0
            c.moveUp();
            System.out.println(c.getCenter().getX() + "," + c.getCenter().getY()); // 1,-1
        }
    }


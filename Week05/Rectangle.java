package Week05;

public class Rectangle {
    public class Point {
        private int x;
        private int y;
        
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        
        public int getX() {
            return x;
        }
        
        public int getY() {
            return y;
        }
        
        @Override
        public String toString() {
            return "Point(" + x + ", " + y + ")";
        }
        
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Point)) {
                return false;
            }
            Point other = (Point) obj;
            return x == other.x && y == other.y;
        }
    }
    
    public class Circle {
        private Point center;
        private double radius;
        
        public Circle(Point center, double radius) {
            this.center = center;
            this.radius = radius;
        }
        
        public Point getCenter() {
            return center;
        }
        
        public double getRadius() {
            return radius;
        }
        
        @Override
        public String toString() {
            return "Circle(" + center + ", " + radius + ")";
        }
        
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Circle)) {
                return false;
            }
            Circle other = (Circle) obj;
            return center.equals(other.center) && radius == other.radius;
        }
    }
    
}

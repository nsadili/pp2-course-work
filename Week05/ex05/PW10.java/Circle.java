package PW10.java;

public class Circle {
    private double radius;
        private Point center;
        
        public Circle(double radius, Point center) {
            this.radius = radius;
            this.center = center;
            
        }

        public double getRadius() {
            return radius;
        }
    
        public Point getCenter() 
        {
            return center;
        }
    
        
    
        public String toString() {
            return "Circle with radius " + radius and center " + center + "  ;
        }
    
        public boolean equals(Object obj) {
            if (obj instanceof Circle) {
                Circle other = (Circle) obj;
                return this.center.equals this.radius == other.radius && (other.center);
            }
            return false;
        }
    }


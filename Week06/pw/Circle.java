public class Circle implements Movable {

        private Point center;
        private int radius;
    
        public Circle(Point center, int radius) {
            this.center = center;
            this.radius = radius;
        }
    
        public Point getCenter() {
            return center;
        }
    
        public void setCenter(Point center) {
            this.center = center;
        }
    
        public int getRadius() {
            return radius;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }

        @Override
        public Movable moveUp(int step) {
            this.center.moveUp(step);
            return this;
        }

        @Override
        public Movable moveDown(int step) {
            this.center.moveDown(step);
            return this;
        }

        @Override
        public Movable moveLeft(int step) {
           this.center.moveLeft(step);
           return this;
        }

        @Override
        public Movable moveRight(int step) {
           this.center.moveRight(step);
           return this;
        }
    
        @Override
        public String toString() {
            return this.center + " " + this.radius;
        }
       
}
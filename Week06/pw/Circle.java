public class Circle implements Movable {

        private Point c;
        private int r;
    
        public Circle(Point c, int r) {
            this.c = c;
            this.r = r;
        }
    
        public Point getCenter() {
            return c;
        }
    
        public void setCenter(Point c) {
            this.c = c;
        }
    
        public int getRadius() {
            return r;
        }

        public void setRadius(int r) {
            this.r = r;
        }

        @Override
        public Movable moveUp(int step) {
            this.c.moveUp(step);
            return this;
        }

        @Override
        public Movable moveDown(int step) {
            this.c.moveDown(step);
            return this;
        }

        @Override
        public Movable moveLeft(int step) {
           this.c.moveLeft(step);
           return this;
        }

        @Override
        public Movable moveRight(int step) {
           this.c.moveRight(step);
           return this;
        }
    
        @Override
        public String toString() {
            return this.c + " " + this.r;
        }
       
}



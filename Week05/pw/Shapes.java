public class Shapes {
    public static class Rectangle {
        private int side1;
        private int side2;

        public Rectangle(int side1, int side2) {
            this.side1 = side1;
            this.side2 = side2;
        }

        public int calculateArea() {
            return this.side1 * this.side2;

        }

        public int calculatePerimete() {
            return 2 * (this.side1 + this.side2);
        }

        public int getSide1() {
            return side1;
        }

        public void setSide1(int side1) {
            this.side1 = side1;
        }

        public int getSide2() {
            return side2;
        }

        public void setSide2(int side2) {
            this.side2 = side2;
        }

        @Override
        public String toString() {
            return "Rectangle [side1=" + side1 + ", side2=" + side2 + "]";
        }

    }
    public static class Square extends Rectangle{
        int a;
        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }


        public Square(int a) {
            super(a, a);
            this.a=a;
        }
    }
    public static class Circle extends Square{
        int r;
        public Circle(int r) {
            super(r);
            this.r = r;
        }
        @Override
        public int calculateArea(){return (int) (Math.PI*r*r);}

        public int getR() {
            return r;
        }

        public void setR(int r) {
            this.r = r;
        }
    }
}

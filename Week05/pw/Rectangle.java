class Rectangle extends Object {
    int width, height;
    public Rectangle(){};
    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }
    public boolean equals(Object o){
        Rectangle r = (Rectangle) o;
        if (r.width == width && r.height == height) return true;
        return false;
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle (5,10);
        Rectangle r2 = new Rectangle (15,10);
        Rectangle r3 = new Rectangle (5,10);
        System.out.println(r1.equals(r2));
        System.out.println(r1.equals(r3));
    }
}
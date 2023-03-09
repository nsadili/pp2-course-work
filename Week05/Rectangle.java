public class Rectangle {
    int n, m;

    public Rectangle(){};

    public Rectangle(int n){
        this.n = n;
    }

    public Rectangle(int w, int h){
        n = w;
        m = h;
    }

    public boolean equals(Rectangle rectangle){
        if(rectangle.n == rectangle.m) return true;
        else return false;
    }

    public static void main(String[] args){
        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(15, 10);
        Rectangle r3 = new Rectangle(5, 10);

        System.out.println(r1.equals(r2));
        System.out.println(r1.equals(r3));
    }
}

class Square extends Rectangle implements Resizable {
    public Square(int side) {
        super(side, side);
    }

    public void setWidth(int side) {
        setWidth(side);
    }

    public void setLength(int side) {
        setLength(side);
    }

    @Override
    public void resize() {
        setWidth(1);
        setLength(1);
    }

    @Override
    public String toString() {
        return "Square[" +
                super.toString() +
                "]";
    }
}

public class Problem3 {
    public static void main(String[] args) {
        Object o1 = new Rectangle(5,  10);
        Object o2 = new Rectangle(15, 15);
        Object o3 = new Square(15);
        System.out.println(o1.equals(o2));
        System.out.println(o1.equals(o3));
        System.out.println(o2.equals(o3));
    }
}

package Week06;

public class Square {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Square other = (Square) obj;
        return side == other.side;
    }

    public static void main(String[] args) {
        Square s1 = new Square(5);
        Square s2 = new Square(10);
        Square s3 = new Square(5);

        System.out.println("Objects are identical: " + s1.equals(s2)); // false
        System.out.println("Objects are identical: " + s1.equals(s3)); // true
    }
}

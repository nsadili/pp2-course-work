public class Point implements Cloneable {
    private int x;
    private int y;

    // constructor, getters, and setters omitted for brevity

    @Override
    public Point clone() {
        try {
            return (Point) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // should never happen
        }
    }
}


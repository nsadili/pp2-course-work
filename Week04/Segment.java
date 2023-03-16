import java.lang.Math;

public class Segment {
    private Point s1;
    private Point s2;

    public Segment(Point s1, Point s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    public int getLength() {
        return (int) Math.sqrt((this.getS2().getY() - this.getS1().getY())*(this.getS2().getY() - this.getS1().getY()) + (this.getS2().getX() - this.getS1().getX())*(this.getS2().getX() - this.getS1().getX())); 
    }

    public Point getS1() {
        return s1;
    }

    public Point getS2() {
        return s2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(s1.toString());
        sb.append(", ");
        sb.append(s2.toString());
        sb.append("]");
        return sb.toString();
    }

    /*
    It is for Ex 18
     * Using StringBuilder to create strings is often a better choice than using the
     * String class when you need to concatenate multiple strings or variables. The
     * reason for this is that String objects are immutable in Java, which means
     * that every time you concatenate two String objects, a new String object is
     * created in memory. This can lead to performance issues when building large
     * strings.
     * 
     * In contrast, StringBuilder is a mutable class, which means that you can
     * modify its contents without creating new objects in memory. This can result
     * in significant performance improvements when building large strings or
     * concatenating many smaller strings. As a result, StringBuilder is often the
     * preferred choice when you need to generate strings dynamically.
     */
}

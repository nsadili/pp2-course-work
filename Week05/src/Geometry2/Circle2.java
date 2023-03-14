package Week05.src.Geometry2;

import java.util.*;


public class Circle2 {
    private Point2 center;
    private float radius;

    public Circle2(Point2 center, float radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point2 getCenter() {
        return center;
    }

    public void setCenter(Point2 center) {
        this.center = center;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float circumference() {
        return 2 * (float) Math.PI * radius;
    }

    public float area() {
        return (float) Math.PI * radius * radius;
    }

    public void translate(float dx, float dy) {
        center.translate(dx, dy);
    }

    public boolean contains(Point2 p) {
        return center.distance(p) <= radius;
    }

    public boolean equals(Circle2 c) {
        return center.equals(c.center) && radius == c.radius;
    }

    @Override
    public String toString() {
        return "Circle {" + "center=" + center + ", radius=" + radius + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Circle2)) {
            return false;
        }

        Circle2 other = (Circle2) obj;

        return center.equals(other.center) && radius == other.radius;
    }
}

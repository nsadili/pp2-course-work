package Week05.src.Geometry2;

import java.util.*;


public class Circle2 {
    private Point center;
    private float radius;

    public Circle(Point center, float radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
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

    public boolean contains(Point p) {
        return center.distance(p) <= radius;
    }

    public boolean equals(Circle c) {
        return center.equals(c.center) && radius == c.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Circle)) {
            return false;
        }

        Circle other = (Circle) obj;

        return center.equals(other.center) && radius == other.radius;
    }
}

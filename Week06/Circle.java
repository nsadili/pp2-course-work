package Week06;

public class Circle extends Shape implements Movable {
    protected Point center;
    protected double radius = 1.0;

    public Circle() {}

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public Circle(Point p2, double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled, Point center) {
        super(color, filled);
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                "} " + super.toString();
    }

	@Override
	public Movable moveUp(int steps) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movable moveDown(int steps) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movable moveLeft(int steps) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movable moveRight(int steps) {
		// TODO Auto-generated method stub
		return null;
	}
}

package Week04;

public class ToString {
    public static void main(String[] args) {

        Point p1 =  new Point();
        Point p2 =  new Point(4, 5);        

        System.out.println(p1.getX() + ", " + p1.getY());
        System.out.println(p2.getX() + ", " + p2.getY());
        System.out.println("P1==P2 ? " + p1.equals(p2));
        p1.translate(2, 3);
        System.out.println("Point p1 is translated to: " + p1.getX() + ", " + p1.getY());
        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p1));
        System.out.println("Are p1 and p2 still equal? " + p1.equals(p2));


        Segment s1 = new Segment(p1, p2);
        Segment s2 = new Segment(1.0f, 2.0f, 3.0f, 4.0f);

        System.out.println("Segment 1: " + "( " + s1.getP1().getX() + ", " + s1.getP1().getY() + "; "
        + s1.getP2().getX() + ", " + s1.getP2().getY() + ")");

        System.out.println("Segment 2: " + "( " + s2.getP1().getX() + ", " + s2.getP1().getY() + "; "
        + s2.getP2().getX() + ", " + s2.getP2().getY() + ")");

        s1.translate(2, 3);
        System.out.println("Segment 1 is translated to: (" + s1.getP1().getX() + ", " + s1.getP1().getY()
        + "), (" + s1.getP1().getX() + ", " + s1.getP1().getY() + ")");

        System.out.println("Segment 1 length = " + s1.length());
        System.out.println("S1==S2 ? " + s1.equals(s2));
        System.out.println("Slope of segment s1: " + s1.getSlope());
        System.out.println("Intercept of segment s1: " + s1.getIntercept());

    }
}
class Point{

	private float x;
	private float y;

	public Point(){
	}

	public Point(float x, float y){
		this.x = x;
		this.y = y;
	}

	public Point(Point p){
		this(p.x, p.y);
	}
	
	public float getX(){
		return x;
	}

	public void setX(float x){
		this.x = x;
	}

	public float getY(){
		return y;
	}

	public void setY(float y){
		this.y = y;
	}

	public void translate(float dX, float dY){
		this.x += dX;
		this.y += dY;
	}

	public float distance(Point p){
		float dx = this.x - p.x;
		float dy = this.y - p.y;
		return (float) Math.sqrt(dx * dx + dy * dy);
	}

	public boolean equals(Point p){
		return this.x == p.x && this.y == p.y;
	}
}
class Segment {

    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public Segment(float x1, float x2, float y1, float y2){
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    }    

    public Point getP1(){
        return this.p1;
    }

    public void setP1(Point p){
        this.p1 = p;
    }

    public Point getP2(){
        return this.p2;
    }

    public void setP2(Point p){
        this.p2 = p;
    }

    public void translate(float dX, float dY){
        this.p1.translate(dX, dY);
        this.p2.translate(dX, dY);
    }

    public float length(){
        return this.p1.distance(p2);
    }

    public boolean equals(Segment s){
        return this.p1.equals(s.p1) && this.p2.equals(s.p2);
    }

    public float getSlope(){
        float dx = this.p2.getX() - this.p1.getX(); 
        float dy = this.p2.getY() - this.p1.getY();
        return dy / dx;
    }

    public float getIntercept(){
        float m = this.getSlope();
        return this.p1.getY() - m * this.p1.getX();
    }

    public boolean isOnLine(Point p){
        // y = mx + b  y == p.getY()  m == getSlope()  x = p.getX()  b = getIntercept()
        return p.getY() == getSlope() * p.getX() + getIntercept();

    }

    public boolean isOnSegment(Point p) {
        float minX = Math.min(this.p1.getX(), this.p2.getX());
        float maxX = Math.max(this.p1.getX(), this.p2.getX());
        float minY = Math.min(this.p1.getY(), this.p2.getY());
        float maxY = Math.max(this.p1.getY(), this.p2.getY());
        return this.isOnLine(p) && p.getX() >= minX && p.getX() <= maxX && p.getY() >= minY && p.getY() <= maxY;
    }
}
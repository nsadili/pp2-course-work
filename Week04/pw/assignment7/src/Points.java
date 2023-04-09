public class Points {
	public double x;
	public double y;

	public Points(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return this.x;
	}

	public double getY() {
		return this.y;
	}

	public static void main(String[] args) {
		Points[] points = new Points[5];
		points[0] = new Points(1, 5);
		points[1] = new Points(3, 1);
		points[2] = new Points(4, 6);
		points[3] = new Points(2, 2);
		points[4] = new Points(7, 4);

		double mostNorth = points[0].getY();
		double mostSouth = points[0].getY();
		double mostWest = points[0].getX();
		double mostEast = points[0].getX();
		for (Points point : points) {
			if (point.getY() > mostNorth) {
				mostNorth = point.getY();
			}
			if (point.getY() < mostSouth) {
				mostSouth = point.getY();
			}
			if (point.getX() < mostWest) {
				mostWest = point.getX();
			}
			if (point.getX() > mostEast) {
				mostEast = point.getX();
			}
		}

		System.out.println("Most Northern point is: " + mostNorth);
		System.out.println("Most Southern point is: " + mostSouth);
		System.out.println("Most Western point is: " + mostWest);
		System.out.println("Most Eastern point is: " + mostEast);
	}
}
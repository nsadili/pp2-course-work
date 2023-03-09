Point p = new Point(0, 0);
Segment s = new Segment(new Point(0, 0), new Point(5, 5));
Circle c = new Circle(new Point(0, 0), 10);

p.moveUp();
s.moveRight();
c.moveDown();

System.out.println(p.getX() + ", " + p.getY());
System.out.println(s.getStart().getX() + ", " + s.getStart().getY() + " - " + s.getEnd().getX() + ", " + s.getEnd().getY());
System.out.println(c.getCenter().getX() + ", " + c.getCenter().getY());

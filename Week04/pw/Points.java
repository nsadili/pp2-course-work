public static void findExtremePoints(Point[] points) {
    Point north = points[0];
    Point south = points[0];
    Point west = points[0];
    Point east = points[0];
  
    for (int i = 1; i < points.length; i++) {
      if (points[i].y > north.y) {
        north = points[i];
      }
      if (points[i].y < south.y) {
        south = points[i];
      }
      if (points[i].x < west.x) {
        west = points[i];
      }
      if (points[i].x > east.x) {
        east = points[i];
      }
    }
  
    System.out.println("Most Northern Point: " + north);
    System.out.println("Most Southern Point: " + south);
    System.out.println("Most Western Point: " + west);
    System.out.println("Most Eastern Point: " + east);
  }

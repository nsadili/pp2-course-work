public static ArrayList<Segment> findShortestSegments(Segment[] segments) {
    double minLength = Double.MAX_VALUE;
    ArrayList<Segment> shortestSegments = new ArrayList<>();

    for (Segment segment : segments) {
        double length = segment.getLength();
        if (length < minLength) {
            minLength = length;
            shortestSegments.clear(); // Remove previous shortest segments
            shortestSegments.add(segment);
        } else if (length == minLength) {
            shortestSegments.add(segment);
        }
    }

    return shortestSegments;
}

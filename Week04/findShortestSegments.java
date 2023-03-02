public static Segment[] findShortestSegments(Segment[] segments) {
    double minLength = Double.POSITIVE_INFINITY;

    // Loop through segments to find minimum length
    for (int i = 0; i < segments.length; i++) {
        double length = segments[i].getLength();
        if (length < minLength) {
            minLength = length;
        }
    }

    // Loop through segments again to find all segments with minimum length
    List<Segment> shortestSegments = new ArrayList<>();
    for (int i = 0; i < segments.length; i++) {
        if (segments[i].getLength() == minLength) {
            shortestSegments.add(segments[i]);
        }
    }

    // Convert list to array and return
    return shortestSegments.toArray(new Segment[0]);
}

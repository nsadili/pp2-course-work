class ArrayOfSegments extends Arrays {
    public static Segment getShortestSegment(Segment[] segments) {
        Segment shortest = null;
        int minLength = Integer.MAX_VALUE;
        for (Segment segment : segments) {
            int length = segment.getLength();
            if (length < minLength) {
                shortest = segment;
                minLength = length;
            }
        }

        return shortest;
    }
}

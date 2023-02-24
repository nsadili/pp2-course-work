public class ArrayofSegments{
   
    public static void main(String[] args) {
        Segment[] segments = {
                new Segment(0, 0, 3, 4),
                new Segment(1, 1, 4, 5),
                new Segment(2, 2, 5, 6),
                new Segment(6, 6, 9, 10),
                new Segment(7, 7, 10, 11),
                new Segment(8, 8, 11, 12),
                new Segment(8, 8, 11, 12)
        };

        Segment[] minSegments = ArrayofSegments.getMinLengthSegments(segments);
        System.out.println("Minimum length segments:");
        for (Segment segment : minSegments) {
            System.out.printf("(%d,%d)-(%d,%d)%n", segment.getX1(), segment.getY1(),
                    segment.getX2(), segment.getY2());
        }
    }


    public class Segment {
        private final int x1;
        private final int y1;
        private final int x2;
        private final int y2;
    
        public Segment(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
    
        public int getLength() {
            int dx = x2 - x1;
            int dy = y2 - y1;
            return (int) Math.sqrt(dx * dx + dy * dy);
        }
    
        public int getX1() {
            return x1;
        }
    
        public int getY1() {
            return y1;
        }
    
        public int getX2() {
            return x2;
        }
    
        public int getY2() {
            return y2;
        }
    }
    
    public static Segment[] getMinLengthSegments(Segment[] segments) {
    if (segments.length == 0) {
        return new Segment[0];
    }
    int minLength = Integer.MAX_VALUE;
    int count = 0;
    for (Segment segment : segments) {
        int length = segment.getLength();
        if (length < minLength) {
            minLength = length;
            count = 1;
        } else if (length == minLength) {
            count++;
        }
    }
    Segment[] minSegments = new Segment[count];
    int index = 0;
    for (Segment segment : segments) {
        if (segment.getLength() == minLength) {
            minSegments[index++] = segment;
        }
    }
    return minSegments;
    
}
}
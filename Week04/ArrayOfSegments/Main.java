package Week04.ArrayOfSegments;

public class Main {
    Segment[] segments = new Segment[] {
        new Segment(0, 0, 0, 3),
        new Segment(0, 4, 0, 0),
        new Segment(0, 0, 1, 1),
        new Segment(0, 1, 0, 1)
    };
    
    Segment[] minLengthSegments = Segment.getMinLengthSegments(segments);{
    for (Segment segment : minLengthSegments) {
        System.out.println(segment.getLength() + ": " + segment.getStartX() + "," + segment.getStartY() +" to " + segment.getEndX() + "," + segment.getEndY());
    }
}
}
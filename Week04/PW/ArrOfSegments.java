import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.List;

public class ArrOfSegments {
    public static void main(String[] args) {
        Line2D[] segments = {
            new Line2D.Double(0, 0, 1, 1),
            new Line2D.Double(1, 1, 2, 2),
            new Line2D.Double(2, 2, 4, 4),
            new Line2D.Double(4, 4, 5, 5),
            new Line2D.Double(5, 5, 7, 7)
        };

        Line2D[] minSegments = findMinLengthSegments(segments);

        for (Line2D segment : minSegments) {
            System.out.println("Segment with minimum length: " + segment);
        }
    }

    public static Line2D[] findMinLengthSegments(Line2D[] segments) {
        if (segments == null || segments.length == 0) {
            return new Line2D[0];
        }

        double minLength = Double.MAX_VALUE;
        for (Line2D segment : segments) {
            double length = segment.getP1().distance(segment.getP2());
            if (length < minLength) {
                minLength = length;
            }
        }

        List<Line2D> minSegments = new ArrayList<>();
        for (Line2D segment : segments) {
            double length = segment.getP1().distance(segment.getP2());
            if (length == minLength) {
                minSegments.add(segment);
            }
        }

        return minSegments.toArray(new Line2D[minSegments.size()]);
    }
}

package Week04.ArrayOfSegments;

public class Segment {
    private int startX;
    private int endX;
    private int startY;
    private int endY;

    public Segment(int startX, int endX, int startY, int endY) {
        this.startX = startX;
        this.endX = endX;
        this.startY = startY;
        this.endY = endY;
    }

    public int getLength() {
        int deltaX = endX - startX;
        int deltaY = endY - startY;
        return (int) Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public static Segment[] getMinLengthSegments(Segment[] segments) {
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


        Segment[] result = new Segment[count];
        int index = 0;
        for (Segment segment : segments) {
            if (segment.getLength() == minLength) {
                result[index] = segment;
                index++;
            }
        }

        return result;
    }

    public int getStartX() {
        return startX;
    }

    public void setStartX(int startX) {
        this.startX = startX;
    }

    public int getEndX() {
        return endX;
    }

    public void setEndX(int endX) {
        this.endX = endX;
    }

    public int getStartY() {
        return startY;
    }

    public void setStartY(int startY) {
        this.startY = startY;
    }

    public int getEndY() {
        return endY;
    }

    public void setEndY(int endY) {
        this.endY = endY;
    }

    
}
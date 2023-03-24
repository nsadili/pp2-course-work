import java.util.ArrayList;
import java.util.List;

public class ArrayOfSegments {
    static class segments {
        float x1;
        float y1;
        float x2;
        float y2;
        public segments(float x1, float y1, float x2, float y2){
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
    }
    public static void main(String [] args){
        
        List<segments> segmentsList = new ArrayList<>();
        segmentsList.add(new segments(1, 2,  3,  4));
        segmentsList.add(new segments(6, 4,  8,  5));
        segmentsList.add(new segments(11, 8, 33, 9));
        segmentsList.add(new segments(9, 43, 5, 23));
       
        segments blank = segmentsList.get(0);
        for (int i = 1; i < segmentsList.size() ; i++ ){
        if (blank == null || distance(segmentsList.get(i)) < distance(blank) ){
            blank = segmentsList.get(i);
        }
        }
        System.out.println("Segment with smallest distance: (" + blank.x1 + ", " + blank.y1 + "), (" + blank.x2 + ", " + blank.y2 + ")");
    }

    
    public static float distance( segments s){
        float dist =(float) Math.sqrt(
             Math.pow(s.x2 - s.x1, 2)
             + Math.pow(s.y2 - s.y1, 2));
             return dist;
    
}
}
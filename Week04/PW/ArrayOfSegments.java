import java.util.ArrayList;
import java.util.Scanner;
import pp2.Segment.Segment;

public class ArrayOfSegments {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of segments: ");
        int n = scan.nextInt();
        System.out.println("Please enter the segments: ");
        Segment p[] = new Segment[n];
        for(int i=0;i<n;i++){
            float x1 = scan.nextFloat();
            float y1 = scan.nextFloat();
            float x2 = scan.nextFloat();
            float y2 = scan.nextFloat();
            p[i] = new Segment(x1, y1, x2, y2);
        }
        
        float lengths[] = new float[n];
        for(int i=0; i<n; i++){
            lengths[i] = p[i].length();
        }
        
        float minLength = Minlen(lengths, n);
        ArrayList<Segment> res = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(p[i].length() == minLength) {
                res.add(p[i]);
            }
        }
        
        System.out.println("The segment(s) with the minimum length:");
        for(Segment s : res){
            System.out.printf("(%.2f, %.2f) to (%.2f, %.2f)\n",
                              s.getP1().getx(), s.getP1().gety(),
                              s.getP2().getx(), s.getP2().gety());
        }
    }   
    
    public static float Minlen(float[] lengths, int n) {
        float min = Float.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(lengths[i] < min) {
                min = lengths[i];
            }
        }
        return min;
    }
}

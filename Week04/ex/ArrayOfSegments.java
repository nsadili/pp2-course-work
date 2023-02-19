import java.util.Scanner;
import pp2.segment.Segment;

public class ArrayOfSegments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int n=sc.nextInt();
        Segment[] s = new Segment[n];
        for (int i=0; i<n; i++){
            float x1=sc.nextFloat();
            float y1=sc.nextFloat();
            float x2=sc.nextFloat();
            float y2=sc.nextFloat();
            s[i]=new Segment(x1,y1,x2,y2); 
        }
        
        double min=Double.MAX_VALUE;

        for (int i=0; i<n; i++){
            if (s[i].length()<min) min=s[i].length();
        }

        System.out.println(min);
        for (int i=0; i<n; i++){
            if (s[i].length()==min) System.out.println("Segment "+(i+1)+"\n"+s[i].toString2());
        }

        sc.close();        
    }
}
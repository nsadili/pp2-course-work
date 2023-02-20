import java.util.Scanner;
import pp2.week03.geometry.Segment;

public class ArraysOfSegments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please add a number: ");
        int n=sc.nextInt();

        Segment[] s = new Segment[n];

        for (int i=0; i<n; i++){
            float x=sc.nextFloat();
            float y=sc.nextFloat();
            float X=sc.nextFloat();
            float Y=sc.nextFloat();
            s[i]=new Segment(x,y,X,Y); 
        }
        
        double mn=Double.MAX_VALUE;

        for (int i=0; i<n; i++){
            if (s[i].length()<mn) mn=s[i].length();
        }

        for (int i=0; i<n; i++){
            if (s[i].length()==mn) System.out.println("Segment "+(i+1)+"\n"+s[i].toString());
        }    
    }
}

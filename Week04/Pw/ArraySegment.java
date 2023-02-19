import java.util.Arrays;
import java.util.Scanner;

import week04.ArrayofSegments.Segment;


public class ArraySegment {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        Segment s[]= new Segment[n];
        Segment s2[]= new Segment[n];
        double min= Double.MAX_VALUE;
        for(int i=0;i<n;i++){
            float a1= sc.nextFloat();
            float b1= sc.nextFloat();
            float a2= sc.nextFloat();
            float b2= sc.nextFloat();
            s[i]= new Segment(a1, b1, a2, b2);
            
        }
        for(int i=0;i<n;i++){
            if(min>s[i].length()){
                min=s[i].length();
            }
        }
        System.out.println("Minimum is: "+min);
        for(int i=0;i<n;i++){
            if(s[i].length()==min){
            
             System.out.println("Our segment with minimum length is : "+ s[i].toString2());
            //String Builder is not so powerful compare to toString() because we should append several times
            }

        }
        
    }
}

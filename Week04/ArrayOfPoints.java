import java.util.*;
import pp2.week03.geometry.*;
public class ArrayOfPoints {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double x_min=0;
        double y_min=0;
        double x_max=0;
        double y_max=0;
        int[] arr =new int[]{3, 4, 1, 2, 5};
        int temparr[]=new int[1000];
        int n,num=0;
        String a;        
        int cnt=0,cnt_temp=0,cnt_arr=0,cnt_num=0;
        int maxcount = 0;
        int max_freq = 0;
        Point[] points = new Point[10];
        for (int i=0; i< points.length;i++) {
            int x = sc.nextInt();
            double y = sc.nextDouble();
            points[i] = new Point(x, y);
        }
        for (Point j: points) {
            if(x_min>j.getX())x_min=j.getX();
            if(y_min>j.getY())y_min=j.getY();
            if(x_max<j.getX())x_max=j.getX();
            if(y_max<j.getY())y_max=j.getY();
        }
        for (Point j: points) {
            if(x_min==j.getX())System.out.println (j.getX()+";"+j.getY()+" is West");
            if(y_min==j.getY())System.out.println (j.getX()+";"+j.getY()+" is North");
            if(x_max==j.getX())System.out.println (j.getX()+";"+j.getY()+" is East");
            if(y_max==j.getY())System.out.println (j.getX()+";"+j.getY()+" is South");
        }
    }
}

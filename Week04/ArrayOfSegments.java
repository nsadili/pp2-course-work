public class ArrayOfSegments {
    public static void main(String args[]) {
        Point pnt=new Point(3,6);
        Point pnt2=new Point(6,1);
        Point pnt3=new Point(2,4);
        Point pnt4=new Point(1,4);
        Point pnt5=new Point(8,4);
        Point pnt6=new Point(2,3);
        Segment s1=new Segment(pnt,pnt2);
        Segment s2=new Segment(pnt3,pnt4);
        Segment s3=new Segment(pnt5,pnt6);

        Segment[] arr={s1,s2,s3}; 

        for(int i=0;i<MINL(arr).length;i++) {
            System.out.printf("X1: %d, Y1: %d, X2: %d, Y2: %d\n",MINL(arr)[i].p1.getX(),MINL(arr)[i].p1.getY(),MINL(arr)[i].p2.getX(),MINL(arr)[i].p2.getY());
        }
    }


    public static Segment[] MINL(Segment[] s) {
        Segment[] min=new Segment[s.length];
        min[0]=s[0];
        int cnt=0;
        for(int i=1;i<s.length-1;i++) {
            if(s[i].length()<min[0].length()) min[0]=s[i];
        }

        for(int i=0;i<s.length-1;i++) {
            if(s[i].length()==min[0].length())  {
                min[cnt]=s[i];
                cnt++;
            }
        }

        Segment[] min1=new Segment[cnt];
        for(int i=0;i<cnt;i++) {
            min1[i]=min[i];
        }
        return min1;
    }
}

class Point {
    private int x;
    private int y;

    Point(int x,int y) {
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public float distance(Point p) {
        float dist= (float) Math.sqrt(Math.pow(p.getX()-this.x, 2)+Math.pow(p.getY()-this.y, 2));
        return dist;
    }
}

class Segment {
    Point p1;
    Point p2;

    public Segment(Point p1,Point p2) {
        this.p1=p1;
        this.p2=p2;
    }

    public float length() {
        return this.p1.distance(p2);
    }

    public Point getP1() {
        return this.p1;
    }

    public Point getP2() {
        return this.p2;
    }
}
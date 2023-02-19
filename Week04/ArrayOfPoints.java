public class ArrayOfPoints {
    public static void main(String args[]) {
        Point pnt1=new Point(2,3);
        Point pnt2=new Point(2,-3);
        Point pnt3=new Point(5,-2);
        Point pnt4=new Point(0,-1);
        Point[] arr={pnt1,pnt2,pnt3,pnt4};

        System.out.println("Northest is: X:"+North(arr).getX()+" Y:"+North(arr).getY());
        System.out.println("Southest is: X:"+South(arr).getX()+" Y:"+South(arr).getY());
        System.out.println("Eathest is: X:"+East(arr).getX()+" Y:"+East(arr).getY());
        System.out.println("Westest is: X:"+West(arr).getX()+" Y:"+West(arr).getY());
    }

    public static Point South(Point[] arr) {
        Point min=arr[0];
        for(int i=1;i<arr.length;i++) {
            if(arr[i].getY()<min.getY()) min=arr[i];
        }
        return min;
    }

    public static Point East(Point[] arr) {
        Point max=arr[0];
        for(int i=1;i<arr.length;i++) {
            if(arr[i].getX()>max.getX()) max=arr[i];
        }
        return max;
    }

    public static Point West(Point[] arr) {
        Point min=arr[0];
        for(int i=1;i<arr.length;i++) {
            if(arr[i].getX()<min.getX()) min=arr[i];
        }
        return min;
    }

    public static Point North(Point[] arr) {
        Point max=arr[0];
        for(int i=1;i<arr.length;i++) {
            if(arr[i].getY()>max.getY()) max=arr[i];
        }
        return max;
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
}



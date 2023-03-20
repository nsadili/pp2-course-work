public class Main {
    public static void main(String[] args) {
      
     Point p1=  new Point();
        
     Point p2= new Point(3,5);

     p1.translate(2,-1);
     p2.translate(5, 2);

     System.out.println(p1.getX()+","+p1.getY());
     System.out.println(p2.getX()+","+p2.getY());
     System.out.println(p1.distance(p2));
    }
}

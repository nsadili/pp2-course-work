package Week02;


public class Main {
    public static void main(String[]args){
    Point p = new Point(3,4);
    Point p2 = new Point(6,8);
    System.out.println(p);
    System.out.println(p2);
    boolean isEqual= p.equals(p2) ? true: false;
    System.out.println(isEqual ? "Yes" : "No" );
    // p2.translate(3, 3);
    System.out.println(p.distance(p2));
  
  }

}
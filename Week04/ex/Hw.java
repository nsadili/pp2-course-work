class Hw2 {
 public Hw2() {
 System.out.println("In constructor X.");
 }
}
class Y extends Hw {
 public Y() {
 System.out.println("In constructor Y.");
 }
}

public class Hw {
 public static void main(String[] args) {
 Y y = new Y();
 }
}

package week10;

public class PairTest {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("A", 1);
        Pair<Integer, Double> pair2 = new Pair<>(2, 3.14);
        
        System.out.println("Key: " + pair1.getKey() + ", Value: " + pair1.getValue());
        System.out.println("Key: " + pair2.getKey() + ", Value: " + pair2.getValue());
        
        pair1.setKey("B");
        pair2.setValue(2.78);
        
        System.out.println("Key: " + pair1.getKey() + ", Value: " + pair1.getValue());
        System.out.println("Key: " + pair2.getKey() + ", Value: " + pair2.getValue());
    }
}


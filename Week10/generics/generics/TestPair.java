package generics;

public class TestPair {
    public static void main(String[] args) {
        
        Pair<String, Integer> pair1 = new Pair<>("Selya", 18);
        Pair<Double, String> pair2 = new Pair<>(17.0, "Gushanshan");

    System.out.println(pair1.getKey());   
    System.out.println(pair1.getValue());  

    System.out.println(pair2.getKey());   
    System.out.println(pair2.getValue()); 

    }
}

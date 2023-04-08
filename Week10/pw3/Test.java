package Week10.pw3;

public class Test {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Age", 42);
        Pair<Integer, String> pair2 = new Pair<>(123, "human");

        System.out.println(pair1); 
        System.out.println(pair2); 

        String key1 = pair1.getKey();
        Integer value1 = pair1.getValue();

        Integer key2 = pair2.getKey();
        String value2 = pair2.getValue();

        System.out.println("(" + key1 + ", " + value1 + ")");
        System.out.println("(" + key2 + ", " + value2 + ")");

    }
}

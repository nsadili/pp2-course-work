public class PairTest {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("foo", 42);

        System.out.println(pair.getKey()); 
        System.out.println(pair.getValue());

        pair.setKey("bar");
        pair.setValue(123);

        System.out.println(pair.getKey()); 
        System.out.println(pair.getValue());

    }
}

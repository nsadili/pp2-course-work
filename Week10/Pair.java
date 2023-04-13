public class Pair<K, V> {

    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "(" + key + ", " + value + ")";
    }

    public static void main(String args[]) {
        Pair<String, Integer> pair = new Pair<>("apple", 5);
        String key = pair.getKey();     // returns "apple"
        Integer value = pair.getValue(); // returns 5
        System.out.println(pair);       // prints "(apple, 5)"
    }

}

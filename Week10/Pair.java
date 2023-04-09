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

    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("uno", 1);
        Pair<Double, String> pair2 = new Pair<>(3.14, "pi");
    
        System.out.println(pair1.getKey() + ": " + pair1.getValue());
        System.out.println(pair2.getKey() + ": " + pair2.getValue());
    }
    
}



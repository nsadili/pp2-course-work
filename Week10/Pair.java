public class Pair <K, V> {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("word", 10);

        // testing
        System.out.println(pair);
        System.out.println(pair.getKey());
        pair.setValue(11);
        pair.setKey("hello");
        System.out.println(pair);
    }

    private K key;
    private V value;
    
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

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pair [key=" + key + ", value=" + value + "]";
    }

    
}
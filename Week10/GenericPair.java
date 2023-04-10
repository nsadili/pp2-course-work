public class GenericPair<K, V> {
    private final K key;
    private final V value;
    
    public GenericPair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    
    public K getKey() {
        return key;
    }
    
    public V getValue() {
        return value;
    }
    
    public String toString() {
        return "(" + key + ", " + value + ")";
    }
}




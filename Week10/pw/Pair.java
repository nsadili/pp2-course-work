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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair)) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        if (!getKey().equals(pair.getKey())) return false;
        return getValue().equals(pair.getValue());
    }
    
    @Override
    public int hashCode() {
        int result = getKey().hashCode();
        result = 31 * result + getValue().hashCode();
        return result;
    }
}

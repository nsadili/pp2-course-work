package Week10.ex3;

public class Pair<K, V> {
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

    public <T extends K> void setKey(T key) {
        this.key = key;
    }

    public <T extends V> void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("{key=%s, value=%s}", key, value);
    }
}

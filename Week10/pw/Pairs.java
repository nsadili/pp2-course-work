public class Pairs<K, V>
 {

    K key;
    V value;

    public Pairs(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public <T extends Number> boolean comparePairs(T key, T value) {

        return key.equals(value);
    }
}
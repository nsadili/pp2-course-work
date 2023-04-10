public class GenericPair<K, V> {

    private K key;
    private V value;

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

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "[ " + key + ", " + value + " ]";
    }

}
public class GenericPairclass<K, V> {
    private final K key;
    private final V value;

    public GenericPairclass(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static <K, V> GenericPairclass<K, V> of(K key, V value) {
        return new GenericPairclass<>(key, value);
    }
}

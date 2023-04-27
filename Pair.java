import java.util.Objects;

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
        return Objects.equals(key, pair.key) &&
                Objects.equals(value, pair.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("foo", 42);
        Pair<String, Integer> pair2 = new Pair<>("bar", 42);

        if (pair1.equals(pair2)) {
            System.out.println("Pairs are equal");
        } else {
            System.out.println("Pairs are not equal");
        }

        System.out.println("Pair 1: " + pair1.getKey() + " = " + pair1.getValue());
        System.out.println("Pair 2: " + pair2.getKey() + " = " + pair2.getValue());
    }
}

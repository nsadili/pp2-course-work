public class GenericPair<K, V> {
    private K key;
    private V value;

    public GenericPair(K k, V v) {
        this.key = k;
        this.value = v;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K k) {
        this.key = k;
    }

    public void setValue(V v) {
        this.value = v;
    }

    @Override
    public String toString() {
        return "(" + key.toString() + ", " + value.toString() + ")";
    }

    public static void main(String[] args) {
        GenericPair<String, Integer> pair1 = new GenericPair<>("Stick", 5);
        GenericPair<Integer, String> pair2 = new GenericPair<>(10, "Door");

        System.out.println(pair1);
        System.out.println(pair2);
    }
}
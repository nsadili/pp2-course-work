package Week10;

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

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
    public static void main(String args[]){
        Pair<String, Integer> pair1 = new Pair<>("foo", 42);
        Pair<Integer, String> pair2 = new Pair<>(1, "bar");

        System.out.println(pair1.getKey() + " = " + pair1.getValue());
        System.out.println(pair2.getKey() + " = " + pair2.getValue());

    }
}

package exercise3;

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

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<>("apple", 3);
        Pair<String, Double> p2 = new Pair<>("orange", 2.5);

        System.out.println("Key: " + p1.getKey() + ", Value: " + p1.getValue());
        System.out.println("Key: " + p2.getKey() + ", Value: " + p2.getValue());
    }
}


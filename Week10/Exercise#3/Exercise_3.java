public class Exercise_3<K, V> {
    private K key;
    private V value;

    public Exercise_3(K key, V value) {
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
        Exercise_3<String, Integer> p1 = new Exercise_3<>("apple", 3);
        Exercise_3<String, Double> p2 = new Exercise_3<>("orange", 2.5);

        System.out.println("Key: " + p1.getKey() + ", Value: " + p1.getValue());
        System.out.println("Key: " + p2.getKey() + ", Value: " + p2.getValue());
    }
}

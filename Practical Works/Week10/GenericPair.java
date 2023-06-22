package Week10;

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
    public static void main(String[] args) {
        GenericPair<String, Integer> pair1 = new GenericPair<>("Key", 10);
        String key = pair1.getKey();
        Integer value = pair1.getValue();
        System.out.println("Pair 1 key: " + key + ", value: " + value);

        GenericPair<Character, Double> pair2 = new GenericPair<>('A', 3.14);
        Character character = pair2.getKey();
        Double number = pair2.getValue();
        System.out.println("Pair 2 key: " + character + ", value: " + number);

        pair2.setKey('B');
        pair2.setValue(2.71);
        System.out.println("Pair 2 (edited) key: " + pair2.getKey() + ", value: " + pair2.getValue());
    }
}

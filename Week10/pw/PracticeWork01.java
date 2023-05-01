package Week10.pw;
class Pair<K, V> {
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
}

public class PracticeWork01 {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(1, "one");
        System.out.println("Key: " + pair1.getKey() + ", Value: " + pair1.getValue());

        Pair<String, Double> pair2 = new Pair<>("pi", 3.14);
        System.out.println("Key: " + pair2.getKey() + ", Value: " + pair2.getValue());

        Pair<Boolean, Character> pair3 = new Pair<>(true, 'A');
        System.out.println("Key: " + pair3.getKey() + ", Value: " + pair3.getValue());
    }
}


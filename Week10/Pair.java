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

    @Override
    public String toString() {
        return "Pair{" + "key=" + key + ", value=" + value + '}';
    }
}

class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("apple", 5);
        Pair<String, String> pair2 = new Pair<>("banana", "yellow");

        System.out.println(pair1);
        System.out.println(pair2);
    }
}
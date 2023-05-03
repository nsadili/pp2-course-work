package Week10.ex03;

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
    
    @Override
    public String toString() {
        return "(" + key + ", " + value + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Sadiq", 5);
        Pair<Double, String> pair2 = new Pair<>(3.14, "pi");
    
        System.out.println(pair1);
        System.out.println(pair2);
    }    
}
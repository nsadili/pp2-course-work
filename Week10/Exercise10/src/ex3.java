public class ex3 {
    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<>("a", 5);
        System.out.println(p1.getKey() + ", " + p1.getValue());

        Pair<Double, Character> p2 = new Pair<>(11.7, 'b');
        p2.setValue('c');
        System.out.println(p2.getKey() + ", " + p2.getValue());
    }   
}

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
    public void setKey(K key) {
        this.key = key;
    }
    public V getValue() {
        return value;
    }
    public void setValue(V value) {
        this.value = value;
    }
}
public class Task3<K, V> {
    private K key;
    private V value;

    public Task3(K key, V value) {
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
            Task3<String, Integer> pair1 = new Task3<>("foo", 42);
            Task3<Integer, Double> pair2 = new Task3<>(123, 3.14);
    
            System.out.println(pair1.getKey() + " => " + pair1.getValue());
            System.out.println(pair2.getKey() + " => " + pair2.getValue());
    
            pair1.setValue(99);
            pair2.setKey(456);
    
            System.out.println(pair1.getKey() + " => " + pair1.getValue());
            System.out.println(pair2.getKey() + " => " + pair2.getValue());
        }
    
    
}

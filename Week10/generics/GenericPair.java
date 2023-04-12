package Week10.generics;

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
            GenericPair<String, Integer> pair1 = new GenericPair<>("one", 1);
            GenericPair<String, Double> pair2 = new GenericPair<>("pi", 3.14);
    
            String key1 = pair1.getKey();
            Integer value1 = pair1.getValue();
    
            String key2 = pair2.getKey();
            Double value2 = pair2.getValue();
    
            System.out.println("Key: " + key1 + ", Value: " + value1);
            System.out.println("Key: " + key2 + ", Value: " + value2);
        }
    
}

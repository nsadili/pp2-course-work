package generics;


public class GenericPair<K, V> {
    public static void main(String[] args) {
        GenericPair<String, Integer> pair = new GenericPair<>("abc", 44);
        String key = pair.getKey(); 
        int value = pair.getValue(); 

        System.out.println("Key: "+key+"\nValue: "+value);
    
    }
    private final K key;
    private final V value;

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
}
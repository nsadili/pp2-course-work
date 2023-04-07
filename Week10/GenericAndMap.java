public class GenericAndMap {

    

    public static void main(String[] args) {
        // Create a new OrderPair object that associates the key "primes" 
        // with a box that can hold an Integer value
        OrderPair<String, Box<Integer>> p = new OrderPair<>("primes", new Box<Integer>(42));

        // Print the key and the value of the OrderPair object

        System.out.println("Key: " + p.getKey());
        System.out.println("Value: " + p.getValue().getContent());
    }
}

// A generic class that represents an ordered pair of a key and a value
class OrderPair<K, V> {
    private K key;
    private V value;

    public OrderPair(K key, V value) {
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

// A generic class that represents a box that can hold a value of type T
class Box<T> {
    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}


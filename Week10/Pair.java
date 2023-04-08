public class Pair<K, V> {
    private K key;
    private V val;

    public static void main(String[] args) {
        Pair<Double, Integer> pair = new Pair<Double, Integer>(3.33, 5);

        Double key = pair.getKey();
        Integer value = pair.getVal();

        System.out.println("Key: " + key);
        System.out.println("Value: " + value);
    }

    public Pair(K key, V val) {
        this.key = key;
        this.val = val;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getVal() {
        return val;
    }

    public void setVal(V val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "Key: " + key + ", value:" + val;
    }

}

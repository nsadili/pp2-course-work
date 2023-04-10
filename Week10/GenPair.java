public class GenPair<K,V> {
    private K key;
    private V value;

    public GenPair(K key,V value) {
        this.key=key;
        this.value=value;
    }

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

    public void setKey(K key) {
        this.key=key;
    }

    public void setValue(V value) {
        this.value=value;
    }

    public static void main(String[] args) {
        GenPair<String,Double> pair=new GenPair<String,Double>("Ulvi", 3.27);

        System.out.println(pair.getKey());
        System.out.println(pair.getValue());

        pair.setKey("Student");
        pair.setValue(3.5);

        System.out.println(pair.getKey()+" "+pair.getValue());

    }
}

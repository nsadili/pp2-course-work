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
    
    public String toString() {
        return "(" + key + ", " + value + ")";
    }
    public <T extends Number> boolean compareByValue(T key, V value){
        return key.equals(value);
    }
     public static void main(String[] args) {
        GenericPair<Integer,Float> pair1=new GenericPair<>(12,14f);
        GenericPair<Double, Integer> pair2 = new GenericPair<>(54.43, 10);
        System.out.println(pair1.getKey() + " : " + pair1.getValue());
        System.out.println(pair2.getKey() + " : " + pair2.getValue());

        System.out.println(pair1.compareByValue(12, 14f));
        System.out.println(pair2.compareByValue(34.5, 23));
        
        System.out.println(pair1.toString());
    }
}
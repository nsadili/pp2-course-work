public class GenericPair<K, V>{
    private K key;
    private V value;
    public GenericPair(K key, V value){
        this.key = key;
        this.value = value;
    }
    
    @Override
    public String toString() {
        
        return "(" + key.toString() + " " + value.toString() + ")";
    }
}
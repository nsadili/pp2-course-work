public class Pair<A, B> {
    private A key;
    private B value;
    public static void main(String[] args) {
        Pair<Double, Integer> pair = new Pair<>(1.11, 2);
    
        Double key = pair.getKey();
        Integer value = pair.getValue();
    
        System.out.println("Key: " + key);
        System.out.println("Value: " + value);
    }
    
    public Pair(A key, B value) {
        this.key = key;
        this.value = value;
    }
    
    public A getKey() {
        return key;
    }
    
    public void setKey(A key) {
        this.key = key;
    }
    
    public B getValue() {
        return value;
    }
    
    public void setValue(B value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return "Key: " + key + ", Value: " + value;
    }

}
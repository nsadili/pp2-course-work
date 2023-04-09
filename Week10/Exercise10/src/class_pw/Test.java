package class_pw;
import java.util.HashMap;

public class Test<K, V> {
    private K a;
    private V b;

    public Test(K key, V value) {
        a = key;
        b = value;
    }

    public K getA() {
        return a;
    }

    public void setA(K a) {
        this.a = a;
    }

    public V getB() {
        return b;
    }

    public void setB(V b) {
        this.b = b;
    }

    public void addToHashMap(HashMap<K, V> hm) {
        hm.put(a, b);
    }
}

package Week10;

public class GenericPairClass <U, V> {
    private U key;
    private V value;

    public GenericPairClass(U key, V value) {
        this.key = key;
        this.value = value;
    }

    public GenericPairClass() {
    }

    public U getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

    public void setKey(U key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericPairClass{" + "key = " + key +", value = " + value + '}';
    }

}
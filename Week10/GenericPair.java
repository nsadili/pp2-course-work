import java.util.Objects;

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

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericPair [key=" + key + ", value=" + value + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((key == null) ? 0 : key.hashCode());
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }


        public boolean equals(Object obj) {
            if (obj instanceof GenericPair<?, ?>) {
                GenericPair<?, ?> other = (GenericPair<?, ?>) obj;
                return Objects.equals(key, other.key) && Objects.equals(value, other.value);
            }
            return false;
        }
    

}

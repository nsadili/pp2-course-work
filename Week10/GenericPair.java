package Week10;

public class GenericPair <P, L> {
    private P key;
    private L value;

    public GenericPair(P key, L value) {
        this.key = key;
        this.value = value;
    }

    public GenericPair() {
    }

    public P getKey() {
        return this.key;
    }

    public L getValue() {
        return this.value;
    }

    public void setKey(P key) {
        this.key = key;
    }

    public void setValue(L value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericPair{" + "key=" + key + ", value=" + value + '}';
    }
}
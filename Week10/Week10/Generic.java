package Week10;

public class Generic <A, B> {
    private A key;
    private B value;

    public Generic(A key, B value) {
        this.key = key;
        this.value = value;
    }

    public Generic() {
    }

    public A getKey() {
        return this.key;
    }

    public B getValue() {
        return this.value;
    }

    public void setKey(A key) {
        this.key = key;
    }

    public void setValue(B value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericClass{" + "key=" + key + ", value=" + value + '}';
    }
}

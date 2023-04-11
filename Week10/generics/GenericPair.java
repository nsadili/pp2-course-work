package generics;

public class GenericPair<K, V> {

    private K pair1;
    private V pair2;

    public GenericPair(K pair1, V pair2) {
        this.pair1 = pair1;
        this.pair2 = pair2;
    }

    public K getPair1() {
        return pair1;
    }

    public V getPair2() {
        return pair2;
    }

    public void setPair2(V pair2) {

        this.pair2 = pair2;

    }

    public void setPair1(K pair1) {
        this.pair1 = pair1;

    }

    @Override
    public String toString() {
        return "[ " + pair1 + ", " + pair2 + " ]";
    }

}
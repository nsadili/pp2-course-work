import java.util.Map;

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
        return "Pair1:" + pair1 + " Pair2:" + pair2;
    }

    public static void main(String[] args) {

        GenericPair<Integer, String> gp1 = new GenericPair<Integer, String>(1, "Seli");
        System.out.println(gp1);
        gp1.setPair1(9);
        System.out.println(gp1.getPair1() + " " + gp1.getPair2());

        GenericPair<Double, Character> gp2= new GenericPair<>(7.8,'d');
        System.out.println(gp2);

    }
}
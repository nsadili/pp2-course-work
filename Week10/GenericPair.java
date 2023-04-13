import java.util.Map;

public class GenericPair<A, B> {

    private A p1;
    private B p2;

    public GenericPair(A p1, B p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public A getP1() {
        return p1;
    }

    public B getP2() {
        return p2;
    }

    public void setP2(B p2) {

        this.p2 = p2;

    }

    public void setP1(A p1) {
        this.p1 = p1;

    }

    @Override
    public String toString() {
        return "P1" +p1 + " P2" + p2;
    }

    public static void main(String[] args) {

        GenericPair<Integer, String> gp1 = new GenericPair<Integer, String>(1, "Bahruz");
        System.out.println(gp1);
        gp1.setP1(9);
        System.out.println(gp1.getP1() + " " + gp1.getP2());

        GenericPair<Double, Character> gp2= new GenericPair<>(3.4,'h');
        System.out.println(gp2);

    }
}

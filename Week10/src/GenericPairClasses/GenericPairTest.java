public class GenericPairTest {

    public static void main(String[] args) {

        GenericPair<String, Integer> p1 = new GenericPair<>("One", 1);
        GenericPair<String, Double> p2 = new GenericPair<>("Two", 2.0);
        GenericPair<Integer, String> p3 = new GenericPair<>(3, "Three");
        GenericPair<Double, String> p4 = new GenericPair<>(4.0, "Four");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}

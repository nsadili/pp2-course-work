package Week10;

public class TestGenericPair {
    public static void main(String[] args) {
        GenericPair<String, Integer> b1 = new GenericPair<String, Integer>("Alisadiq", 20);
        GenericPair<String, Double> b2 = new GenericPair<>("Shukurov", 2.56);
        GenericPair<Boolean, Float> b3 = new GenericPair<>(true, 344f);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println();

        b1.setValue(18);
        b2.setKey("Shukurov");
        b3.setKey(false);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
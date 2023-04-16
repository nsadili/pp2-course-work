package Week10;

public class TestGenericPair {
    public static void main(String[] args) {
        GenericPair<String, Integer> p1= new GenericPair<String, Integer>("Garib", 102);
        GenericPair<String, Double> p2= new GenericPair<>("Guluzada", 1.23);
        GenericPair<Boolean, Float> p3= new GenericPair<>(true, 256f);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println();

        p1.setValue(50);
        p2.setKey("Guliyev");
        p3.setKey(false);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}
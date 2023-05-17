package Week10;

public class TestGenericPair {
    public static void main(String[] args) {
        GenericPair<String, Integer> p1= new GenericPair<String, Integer>("Javidan", 18);
        GenericPair<String, Double> p2= new GenericPair<>("Taghiyev", 3.4);
        GenericPair<Boolean, Float> p3= new GenericPair<>(true, 344f);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println();

        p1.setValue(80);
        p2.setKey("Mammadov");
        p3.setKey(false);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}
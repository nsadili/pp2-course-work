public class GenericPairTest {
    public static void main(String[] args) {
        GenericPair<String, Integer> p1 = new GenericPair<String, Integer>("Nilufar", 18);

        GenericPair<String, Double> p2 = new GenericPair<>("Babayeva", 6.7);

        GenericPair<Boolean, Float> p3 = new GenericPair<>(false, 425f);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println();

        p1.setValue(25);

        p2.setKey("Ruslan");
        
        p3.setKey(false);

            System.out.println(p1);
             System.out.println(p2);
            System.out.println(p3);
     }
}

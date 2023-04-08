public class TestGenericPair {
    public static void main(String[] args) {
        GenericPair<String, Integer> p1= new GenericPair<String, Integer>("Ibrahim", 18);
        GenericPair<String, Double> p2= new GenericPair<>("Huseynov", 3.67);
        GenericPair<Boolean, Float> p3= new GenericPair<>(true, 344f);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println();

        p1.setValue(20);
        p2.setKey("Aliyev");
        p3.setKey(false);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}

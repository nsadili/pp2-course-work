public class GenericPairTest {
    
    public static void main(String[] args) {

        GenericPair<Integer, String> p1 = new GenericPair<>(4, "Mrdv");
        GenericPair<String, Float> p2 = new GenericPair<>("M", 4.9f);
        GenericPair<Boolean, Double> p3 = new GenericPair<>(true, 4.9);

        System.out.println(p1); 
        System.out.println(p2); 
        System.out.println(p3); 
        
    }
}
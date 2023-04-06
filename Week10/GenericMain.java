
public class GenericMain {
    public static void main(String[] args) {
        GenericPair<String, Integer> pair1 = new GenericPair<>("Amina", 18);
        GenericPair<String, Integer> pair2 = new GenericPair<String, Integer>("Rahima", 17);
        System.out.println(pair1);
        System.out.println(pair1.equals(pair2));
    }
}

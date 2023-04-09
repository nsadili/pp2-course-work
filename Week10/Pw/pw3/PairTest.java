package Pw.pw3;

public class PairTest {
    

    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(5, "five");
        Pair<String, Double> pair2 = new Pair<>("e",2.71828 );
        Pair<Character, Boolean> pair3 = new Pair<>('c', true);

        System.out.println(pair1); 
        System.out.println(pair2); 
        System.out.println(pair3); 
    }

}

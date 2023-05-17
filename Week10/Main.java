package Week10;
public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Alice", 25);
        Pair<Integer, Double> pair2 = new Pair<>(42, 3.14);
        Pair<Character, Boolean> pair3 = new Pair<>('X', true);

        System.out.println(pair1.getKey() + " - " + pair1.getValue());
        System.out.println(pair2.getKey() + " - " + pair2.getValue());
        System.out.println(pair3.getKey() + " - " + pair3.getValue());
    }
}

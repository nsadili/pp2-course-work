package Week10.ex3;

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> numPair = new Pair<>("One", 1);
        System.out.println(numPair.getKey());
        System.out.println(numPair.getValue());
        System.out.println(numPair);
        numPair.setKey("Two");
        numPair.setValue(2);
        System.out.println(numPair);
    }
}

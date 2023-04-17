package PW;

public class TestPair {
    public static void main(String[] args){
        Pair<String, Integer> pair = new Pair<>("key", 18);
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
    }
}

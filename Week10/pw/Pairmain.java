package Week10.pw;


public class Pairmain {
    public static void main(String[] args) {
        Pair<Integer, Float> myPair = new Pair<>(25, 25f);
        Pair<Double, Float> myPair2 = new Pair<>(25.00, 25f);

        System.out.println(myPair.getKey());
        System.out.println(myPair.getValue());

        System.out.println();

        System.out.println(myPair.equals(myPair2));

        System.out.println(myPair.comparePairs(25, 25f));
    }
}
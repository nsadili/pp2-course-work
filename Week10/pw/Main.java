public class Main {
    public static void main(String[] args) {

        // create a Pair with a Double key and a Float value
        Pairs<Double, Float> pair = new Pairs<>(3.14, 1.23f);

        // compare the key and value of pair3 using the comparePairs method
        boolean result = pair.comparePairs(pair.getKey(), pair.getValue());
        System.out.println("Result : " + result);
    }
}


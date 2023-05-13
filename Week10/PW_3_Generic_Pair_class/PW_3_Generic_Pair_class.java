public class PW_3_Generic_Pair_class {
    public static void main(String[] args) {

        Pair<String, Integer> p1 = new Pair<>("one", 1);
        String key = p1.getKey(); // returns "one"
        Integer value = p1.getValue(); // returns 1

        Pair<Double, String> p2 = new Pair<>(3.14, "pi");
        Double key2 = p2.getKey(); // returns 3.14
        String value2 = p2.getValue(); // returns "pi"

        System.out.println(key);
        System.out.println(value);

        System.out.println(key2);
        System.out.println(value2);

    }

}
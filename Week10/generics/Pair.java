package week10.generics;

public class Pair<M, N> {
    private final M key;
    private final N value;

    public Pair(M key, N value) {
        this.key = key;
        this.value = value;
    }

    public M getKey() {
        return key;
    }

    public N getValue() {
        return value;
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Pair<?, ?> pair = (Pair<?, ?>) o;

        if (!key.equals(pair.key))
            return false;

        return value.equals(pair.value);
    }

    public int hashCode() {
        int result = key.hashCode();
        result = 21 * result + value.hashCode();
        return result;
    }

    public String toString() {
        return "(" + key + ", " + value + ")";
    }

    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("one", 1);
        Pair<String, Integer> pair2 = new Pair<>("two", 2);

        System.out.println(pair1);
        System.out.println(pair2);
        System.out.println("pair1 is equal to pair2? " + pair1.equals(pair2));
    }
}

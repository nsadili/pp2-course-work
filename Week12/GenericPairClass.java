public class GenericPairClass<M, N> {
    private final M key;
    private final N value;

    public GenericPairClass(M key, N value) {
        this.key = key;
        this.value = value;
    }

    public M getKey() {
        return key;
    }

    public N getValue() {
        return value;
    }

    public static <M, N> GenericPairClass<M, N> of(M key, N value) {
        return new GenericPairClass<>(key, value);
    }
}
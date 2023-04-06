package generics;

public class GenericNumericFunction {
    public static void main(String[] args) {

    }

    class GenericNumericFunction1<T extends GenericNumericFunction> {

    }

    static <T extends Comparable<? super T>> void genericNumeric(T value) {

    }

}
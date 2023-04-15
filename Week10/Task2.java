public class Task2<T extends Number> {
    private T value;

    public Task2(T value) {
        this.value = value;
    }

    public T reciprocal() {
        return (T) Double.valueOf(1 / value.doubleValue());
    }

    public T fractionalPart() {
        return (T) Double.valueOf(value.doubleValue() - value.intValue());
    }

    public boolean absoluteValueEqual(Float value2) {
        return Math.abs(value.doubleValue()) == Math.abs(value2.doubleValue());
    }

    public static void main(String[] args) {
        Task2<Double> doubleTask = new Task2<>(9.76);
        System.out.println("Reciprocal of " + doubleTask.value + " is " + doubleTask.reciprocal());
        System.out.println("Fractional part of " + doubleTask.value + " is " + doubleTask.fractionalPart());

        Task2<Float> floatTask = new Task2<>(-3.14f);
        System.out.println("Absolute value of " + doubleTask.value + " and " + floatTask.value + " are equal: "
                + doubleTask.absoluteValueEqual(floatTask.value));
    }
}

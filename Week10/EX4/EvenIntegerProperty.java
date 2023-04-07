package EX4;

public class EvenIntegerProperty implements SpecificProperty<Integer> {

    @Override
    public boolean test(Integer el) {
        return el % 2 == 0;
    }
}

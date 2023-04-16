package Week10.ex4;

public class EvenIntegerProperty implements SpecificProperty<Integer> {
    @Override
    public boolean hasProperty(Integer el) {
        return el % 2 == 0;
    }
}

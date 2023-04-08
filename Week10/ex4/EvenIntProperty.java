package Week10.ex4;

public class EvenIntProperty implements SpecificProperty<Integer> {
    @Override
    public boolean test(Integer el) {
        return el % 2 == 0;
    }
}

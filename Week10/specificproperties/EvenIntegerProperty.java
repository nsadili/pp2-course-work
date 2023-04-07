package specificproperties;

public class EvenIntegerProperty implements SpecificProperty<Integer>{
    @Override
    public boolean test(Integer a) {
        return a%2==0;
    }
}

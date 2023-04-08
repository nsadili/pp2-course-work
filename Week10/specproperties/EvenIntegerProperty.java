package specproperties;

public class EvenIntegerProperty implements SpecificElement<Integer> {

    @Override
    public boolean check(Integer obj) {
        return obj % 2 == 0;
    }

}

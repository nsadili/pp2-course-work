package Specproperties;

public class EvenIntegerProperty implements SpecificProperty<Integer> {

    @Override
    public boolean check(Integer obj) {

        return obj % 2 == 0;

    }

}

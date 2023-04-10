package specproperties;

public class EvenIntegerProperty implements SpecificProperty<Integer>{

    public boolean check(Integer obj) {
        return obj % 2 == 0;
    }
}

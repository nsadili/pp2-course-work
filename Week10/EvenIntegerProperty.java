package Week10;

public class EvenIntegerProperty implements SpecificElementCoun<Integer> {

    @Override
    public boolean hasProp(Integer el) {
        return el % 2 == 0;
    }
    
}

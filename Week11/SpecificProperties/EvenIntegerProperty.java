package Week11.SpecificProperties;

public class EvenIntegerProperty implements SpecificProperty<Integer> {

    @Override
    public boolean test(Integer el) {
        return el%2==0;
    }

    
}
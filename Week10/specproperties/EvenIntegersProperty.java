package specproperties;

public class EvenIntegersProperty implements SpecificProperty<Integer> {

    public boolean check(Integer obj) {

        return obj % 2 == 0;
    }
    
}
package Week10.SpecificProperty;

public class IntegerProperty implements PropertyTester<Integer> {

    @Override
    public boolean test(Integer el) {
        return el%2==0;
    }
    
}

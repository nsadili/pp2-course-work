package Week10;

public class EvenIntegerProperty 
    implements SpecificProperty<Integer> {

    @Override
    public boolean hasProp(Integer el) {
       return el % 2==0;
    }
    
}

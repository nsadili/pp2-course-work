public class EvenIntegerProperty implements SpecificProperty<Integer>{
    @Override
    public boolean hasProp(Integer el) {
        // TODO Auto-generated method stub
        return el%2==0;
    }
}

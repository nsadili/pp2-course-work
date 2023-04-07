public class EvenInteger implements SpecificProperties<Integer> {
    @Override
    public boolean hasProp(Integer el){
        return el % 2==0;
    }
}

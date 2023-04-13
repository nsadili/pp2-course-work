public class EvenInteger implements SpecificProperties<Integer> {
    @Override
    public boolean test(Integer el){
        return el % 2==0;
    }
}

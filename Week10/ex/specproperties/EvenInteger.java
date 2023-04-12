package specproperties;

public class EvenInteger implements Specific<Integer> {
    
    public boolean check(Integer obj){
        return obj % 2 == 0;
    }

}

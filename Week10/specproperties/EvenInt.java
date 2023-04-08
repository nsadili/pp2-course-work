package specproperties;

public class EvenInt implements Specificproperty <Integer> {

    public boolean check(Integer obj) {
        return obj % 2 == 0;
    }
}

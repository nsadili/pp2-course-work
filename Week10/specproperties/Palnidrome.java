package specproperties;

public class Palnidrome implements Specificproperty <String> {
    @Override
    public boolean check(String obj) {
        return new StringBuilder(obj.reverse().toString());
    }
}

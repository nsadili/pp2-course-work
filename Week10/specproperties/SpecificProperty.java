package specproperties;

public interface SpecificProperty<T> {
    boolean check(T obj);
}

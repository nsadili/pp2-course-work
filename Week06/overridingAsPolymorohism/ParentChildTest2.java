package overridingAsPolymorohism;

public class ParentChildTest2 {
    public static void main(String[] args) {
        Parent obj = new Child();

        //obj.someMethod(); -> error – this method is only available in Child.

        ((Child) obj).someMethod();


    }
}

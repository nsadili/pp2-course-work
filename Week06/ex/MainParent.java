public class MainParent {
    public static void main(String[] args) {
        
        Parent parent = new Parent();
        Child child = new Child();

        System.out.println(parent.calcValue(3, 5));
        System.out.println(child.calcValue(3, 5));
        child.someMethod();
    }
}

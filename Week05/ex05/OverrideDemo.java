public class OverrideDemo {
    public static void main(String[] args) {
        Child child = new Child();

        System.out.println(child.calcValue(5));
        System.out.println(child.calcValue(5, 10)); }
    }

    class Parent {  
        public int calcValue(int a) {
            System.out.println("Super"); return a * 2;
        }
    }

    class Child extends Parent {
        public int calcValue(int a, int b) {
            System.out.println("Subclass");
            return (a + b) * 2;
        }
    }
    /*
     * This is an example of method overloading
     * since we have the same named methods with different parameters.
     * The result will be: 
     * Super
     * 10
     * Subclass
     * 30
     */
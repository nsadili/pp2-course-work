package Week05.src.TypesOfInheritance;

public class MultipleInheritance {
    interface A {
        void methodA();
    }

    interface B {
        void methodB();
    }

    class C implements A, B {
        public void methodA() {
            System.out.println("Method A");
        }

        public void methodB() {
            System.out.println("Method B");
        }
    }

}

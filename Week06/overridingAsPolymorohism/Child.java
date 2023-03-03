package overridingAsPolymorohism;

class Child extends Parent {
    
    public int calcValue(int a, int b) {
        System.out.println("Subclass");
        return a*b;
    }

    public void someMethod() {
        System.out.println("New Method");
    }

}

class A {
    public int someValue;
    public String getText() { return "Some info"; }
    }
    class B extends A {
    public String getText() { return "Extra info"; }
    public void myMethod() {
    System.out.println("The value: "+super.someValue);
    System.out.println("The parent method: "+super.getText());
    System.out.println("The child method: "+this.getText()); // or getText();
    }
    public static void main(String args[]) {
    B b = new B();
    b.myMethod(); 
    }
    }
    
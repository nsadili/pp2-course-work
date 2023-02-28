class C {
    public int someValue;
    public String getText() { 
        return "Some info"; 
    }
    public static void main(String[] args) {
        D d = new D();
        d.myMethod(); 
        }
    }
    class D extends C {

    public String getText() { 
        return "Extra info"; 
    }
    public void myMethod() {
    System.out.println("The value: "+super.someValue);
    System.out.println("The parent method: "+super.getText());
    System.out.println("The child method: "+getText()); // or this.getText();
    }
    }
    
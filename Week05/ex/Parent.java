class Square extends Rectangle {
    public Square(int sideSize) {
    super(sideSize,sideSize);
    super.name = "Square";
    Square s = new Square(5);
    System.out.println(s);
    }
    
    class Child extends Parent {
        public int calcValue(int a, int b) {
        System.out.println("Subclass");
        return (a+b)*2;
        }
        public int calcValue(int a) {
        System.out.println("Super");
        return a*2;
        }
        }
        
    }
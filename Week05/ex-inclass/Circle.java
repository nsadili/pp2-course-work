class Shape {
    private String shapeName;
    public Shape(String name) {
    this.shapeName = name;
    }
    public String getShapeName() { return shapeName; }
    }
    class Circle extends Shape {
    public Circle() {
    super("Circle"); //calling the constructor of the Shape class 
    }
    public static void main(String[] args) {
    Circle c = new Circle();
    System.out.println("My name is: "+ c.getShapeName()); 
    }
    }
class Circle extends Shape {

    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("My name is: "+ c.getShapeName()); 
        }

    public Circle() {
    super("Circle"); //calling the constructor of the Shape class 
    }
    }
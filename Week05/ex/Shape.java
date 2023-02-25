class Shape {

    private String shapeName;
    public Point center;
    public Color fillColor;

    public Shape(String name) {
    this.shapeName = name;
    }

    public String getShapeName() {
         return shapeName; 
    }
    
    }
    
    class Circle extends Shape {
    // This class also has center and fillColor members, 
    // and also getShapeName() method 
    // shapeName is not inherited (DIRECTLY), since it’s private

    public Circle(String shapeName, Point center, Color fillColor) {

     super(shapeName);

    }
    
    }
    
class Rectangle {
    protected String name = "Rectangle";
    private int height, width;
    
    public Rectangle(int h, int w) {
        height = h;
        width = w;
    }

    public int calcPerimeter() {
        return 2 * (height + width);
    }

    public int calcArea() {
        return height * width;
    }

    public void printName() {
        System.out.println("I'm a " + name);
    }

}

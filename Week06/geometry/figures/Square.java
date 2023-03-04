package geometry.figures;

public class Square extends Rectangle {
    protected double side;

    public Square(){};
    public Square(double side){
        setSide(side);
    };
    public Square(double side, String color, boolean filled){
        setColor(color);
        setFilled(filled);
        setSide(side);
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }
    
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }
    
    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public void resize() {
        throw new UnsupportedOperationException("Unimplemented method 'resize'");
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getSide() {
        return side;
    }

    @Override
    public String toString() {
        return "Square[Rectangle[Shape[" + this.color + ", filled = " + this.filled + ", width = " + this.width + ", length = " + this.length + "]]";
    }
}
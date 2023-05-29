public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
    }

    public Square(){
    }

    public Square(double side){
        super(side,  side);
    }
    
    public Square(double side, String color, boolean filled) {
        super(side, side);
        this.color = color;
        this.filled = filled;
    }

    public double getSide(){
        return getHeight();
    }
    
    public void setSide(double side) {
        setHeight(side);
        setWidth(side);
    }

    public void setWidth(double side) {
        setSide(width);
    }

    public void setHeight(double side) {
        setSide(height);
    }

    public String toString() {

        return "Square[Rectangle[Shape[color=" + color
        + ", filled=" + filled 
        + "], width=" + width 
        + ", height" + height
        + "]]";
    }
    @Override
    public Resizable resize() {
        this.height *= width;
        this.width *= height;
        return this;
}

}
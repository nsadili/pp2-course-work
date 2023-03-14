package Week06;

public class Square extends Shape implements Resizable {
    public Square(int side){
        super(side, side);
    }
    public void setWidth(int side){
        setWidth(side);
    }
    public void setHeight(int side){
        setHeight(side);
    }

    @Override
    public void resize() {
        // TODO Auto-generated method stub
        setWidth(1);
        setHeight(1);
       // throw new UnsupportedOperationException("Unimplemented method 'resize'");
    }

    @Override
    double getArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getArea'");
    }

    @Override
    double getPerimeter() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPerimeter'");
    }
    
}

class Rectangle{
    int width, height;

    public Rectangle(int w, int h){
        width = w;
        height = h;
    }
    @Override
    public boolean equals(Object obj){
        Rectangle rect = (Rectangle) obj;

    }
}

class Square extends Rectangle{
    public Square(int side){
        super(side, side);
    }
}


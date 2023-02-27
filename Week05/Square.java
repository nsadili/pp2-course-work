package Week05;



public class Square extends Rectangle{
    public int side;

    public Square(int s){
       super(s, s);
    }

    public int getSide() {
        return this.side;
    }

    public void setSide(int side) {
        this.side = side;
    }
    public boolean equals(Object obj){
        return super.equals(obj);
    }

        
    }
    
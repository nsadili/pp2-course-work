public class Point
{
    private float x; //field
    private float y;

    public Point()
    {
        this(0.0f, 0.0f);
    }

    public Point (float x, float y)
    {
        this.x = x;
        this.y = y;
    }

    public float getX()
    {
        return x;
    }

    public void setX(float x)
    {
        this.x= x;
    }


    public float getY()
    {
        return y;
    }

    public void setY(float y)
    {
        this.y = y;
    }

    @Override
    public String toString()
    {
        return "(" + this.x + ", " + this.y + ")";
    }

    @Override
    public boolean equals(Object obj) 
    {
        if(obj == null) return false;

        if(! (obj instanceof Point)) return false;

        //typecasting(in our case it is downcasting)  look-> downcasting(converting to smaller) and upcasting(converting larger object)
        Point that = (Point) obj;

        return this.x == that.x  && this.y == that.y;     
    }


}

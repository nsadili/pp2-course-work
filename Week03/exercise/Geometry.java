public class Geometry {
    private float x;
    private float y;

    Geometry ()
    {

    }

    Geometry (float x, float y)
{
    this.x=x;
    this.y=y;
}
    Geometry (Geometry p)
{
    this.x=p.x;
    this.y=p.y;

}
    public float getX()
    {
       return this.x;
    }
    
    public float getY()
    {
        return this.y;
    }
    
    public void setX (float x)
    {
        this.x=x;
    }

    public void setY (float y)
    {
        this.y=y;
    }

    public void translate (float dX, float dY)
    {
        setX(dX);
        setY(dY);
    }

    public float distance(Geometry p)
    {
       double xDistanceSquare = Math.pow(this.x - p.x, 2);
       double xDistanceSquare = Math.pow(this.y - p.y, 2);
       double distanceSquare = xDistanceSquare + yDistanceSquare;
       double dist = Math.sqrt(distanceSquare);
       return (float) dist;
    }

    public boolean equals (Geometry p)
    {
        if(this.x == p.x && this.y == p.y) 
        return true;
        return false;
        
    } 
}

package EX1;

public class Point implements Movable {

    private float a;
    private float b;

    public Point(float a, float b)
    {
        this.a = a;
        this.b = b;
    }

    public float getA()
        {
            return a;
        }

        public float getB()
        {
            return b;
        }

    public void setA(float a)
    {
        this.a = a;
    }

    public void setB(float b)
    {
        this.b = b;
    }

    public String toString(){
        return "("+this.a+","+this.b+")";
    }
}

import java.lang.Math;

public class Triangle
{
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA()
    {
        return a;
    }
 
    public void setA(int a) 
    {
        this.a = a;
    }

    public int getB()
    {
        return a;
    }
 
    public void setB(int b) 
    {
        this.b = b;
    }

    public int getC()
    {
        return c;
    }
 
    public void setC(int b) 
    {
        this.c = c;
    }

    public double getArea()
    {
        double p = (a+b+c) / 2.0 ;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

}
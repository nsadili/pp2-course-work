package Week11;

public class Color {



    int r, g, b;



    public Color(int r, int g, int b) {

        this.r = r;

        this.g = g;

        this.b = b;

    }



    public Color(int i, double d) {
    }



    public int getR() {

        return r;

    }



    public int getG() {

        return g;

    }



    public int getB() {

        return b;

    }



    @Override

    public String toString() {

        return "Color [r=" + r + ", g=" + g + ", b=" + b + "]";

    }



}
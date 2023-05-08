package Exs;



public class Color {

    int b, y, g;

    public Color(int b, int y, int g) {
        this.b = b;
        this.y = y;
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public int getG() {
        return y;
    }

    public int getR() {
        return g;
    }

    @Override
    public String toString() {
        return "blue:" + b + " yellow:" + y + " grey:" + g;
    }

}

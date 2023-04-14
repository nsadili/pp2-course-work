package ex6;

public class Color {

    int r, g, b;

    public Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public int getG() {
        return g;
    }

    public int getR() {
        return r;
    }

    @Override
    public String toString() {
        return "red:" + r + " green:" + g + " blue:" + b;
    }

}

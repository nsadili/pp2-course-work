package Week05.EX11;

public class rectangle {
    private int width, height;

    public rectangle(int w, int h) {
        width = w;
        height = h;
    }

    public boolean equals(Object obj) {
        if (obj instanceof rectangle) {
            rectangle rect = (rectangle) obj;
            return (rect.width == this.width) && (rect.height == this.height);
        }
        return false;
    }

}
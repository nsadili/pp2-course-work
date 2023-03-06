package pp2.week06;

public class rectangle {
    int width, height;

    public rectangle(int w, int h) {
        width = w;
        height = h;
    }

    public boolean equals(Object rect) {
        rectangle rectangle = (rectangle) rect;
        if (rectangle.height == this.height && rectangle.width == this.width);
        return true;
    }

}



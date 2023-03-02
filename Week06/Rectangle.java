package Week06;

public class Rectangle {
    private Integer width, height;

    public Rectangle(Integer width , Integer height){
        this.width = width;
        this.height = height;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getWidth() {
        return width;
    }
    

    public boolean equals(Rectangle p) {
        return width.equals(p.width) &&
                height.equals(p.height);
    }
            
    
}


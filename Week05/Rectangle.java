class Rectangle {
    private double width;
    private double height;
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public double getWidth() {
        return width;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == this) { 
            return true;
        }
        
        if (!(obj instanceof Rectangle)) { 
            return false;
        }
        
        Rectangle other = (Rectangle) obj; 
        return Double.compare(width, other.width) == 0 && Double.compare(height, other.height) == 0;
    }
}

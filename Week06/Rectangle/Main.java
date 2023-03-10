package Rectangle;
Rectangle rect1 = new Rectangle(10, 20);
Rectangle rect2 = null;
try {
    rect2 = rect1.clone();
} catch (CloneNotSupportedException e) {
    e.printStackTrace();
}
System.out.println(rect1.equals(rect2)); // prints "true"

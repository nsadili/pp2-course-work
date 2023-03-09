class Cart {
    private Integer nbItems;
    { this.nbItems = 1; }
    public Cart (int nbItems) { this.nbItems = nbItems; }
    public static void main (String[] args) {
    Cart c1 = new Cart (5), c2 = new Cart (10), c3 = new Cart (15);
    c1.nbItems = c2.nbItems;
    c2 = c1;
    c3 = null;
    System.out.println ("cl.nbItems: " + c1.nbItems);
    System.out.println ("c2.nbItems: " + c2.nbItems) ;
    System.out.println ("c3.nbItems: " + c3.nbItems);
    }
}
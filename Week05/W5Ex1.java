class X {
    public X() {
    System.out.println("In constructor X.");
    }
   }
   class Y extends X {
    public Y() {
    System.out.println("In constructor Y.");
    }
   }
   class first {
    public static void main(String[] args) {
    Y y = new Y();
    }
   }
   
   /*The code produces the output "In constructor X In constructor Y" because class Y inherits from class X. 
   We defined class X first and declared it as public, making it visible to class Y. 
   If we had declared class X as private, we would have encountered an error because 
   a private class cannot be extended by another class. */
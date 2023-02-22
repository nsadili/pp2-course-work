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
   
   //The output of the code is "In constructor X In constructor Y"
   //we get his out put, becuase Y is being inhereted from X. As we can see firstly we wrote class X, and wrote public, so it will be visible for class Y
   //that's why we get such an output. However, if we do write to X private, so the code will show error, because 
   //it is impossible to extend one class to a private one
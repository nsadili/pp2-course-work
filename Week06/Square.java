package Week06;

class X {
    public void callMe() { System.out.print("X:"); }
    public static void main(String[] args){ X ref1 = new X(), ref2 = new Y(); Y ref3 = new Y() ;
    refl.callMe(); ref2.callMe(); ref3.callMe();
    class Y extends X {
    public void callMe() { System.out.print("Y:"); }
    }
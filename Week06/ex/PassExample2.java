class MyObj{
    int a = 5;
    public int getA() {
    return a; 
    }
    public void setA(int a) {
    this.a = a;
    }
    }
    
    class PassExample2 {
        public void changeValue(MyObj obj) {
        obj.setA(22);
        }
        
        public static void main(String args[]) {
        PassExample2 pe = new PassExample2();
        MyObj mo = new MyObj();
        System.out.println("In the start :" + mo.getA());
        pe.changeValue(mo);
        System.out.println("Now a is :" + mo.getA());
        }
        }
        
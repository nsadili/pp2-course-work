package week6;
 class PassExample {
    /*
    public void changeValue(int  x) {
        x = x + 2;
        }
        public static void main(String args[]) {
        PassExample pe = new PassExample();
        int a = 5;
        System.out.println("In the start a is :" + a);
        pe.changeValue(a);
        System.out.println("Now a is :" + a);
        }
        */
       /* public void changeValue(int [] arr) {           // this kinda methods can affect only the arrays 
            arr[1] = -1;
            }
            public static void main(String args[]) {
            PassExample pe = new PassExample();
            int [] arr = {1,2,3};
            System.out.println("In the start : {" + arr[0] + ","+arr[1]+","+arr[2]+"}");
            pe.changeValue(arr);
            System.out.println("Now : {" + arr[0] + ","+arr[1]+","+arr[2]+"}");
            }  */
            public void changeValue(MyObj obj) {
                obj.setA(22);
                }
                
                public static void main(String args[]) {
                PassExample pe = new PassExample();
                MyObj mo = new MyObj();
                System.out.println("In the start :" + mo.getA());
                pe.changeValue(mo);
                System.out.println("Now a is :" + mo.getA());  // with the set it works 
                }
                

        
    
}
class MyObj{
    int a = 5;
    public int getA() {
    return a;
    }
    public void setA(int a) {
    this.a = a;
    }
    }
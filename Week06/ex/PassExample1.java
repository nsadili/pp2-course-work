class PassExample1 {
    public void changeValue(int [] arr) {
    arr[1] = -1;
    }
    public static void main(String args[]) {
    PassExample1 pe = new PassExample1();
    int [] arr = {1,2,3};
    System.out.println("In the start : {" + arr[0] + ","+arr[1]+","+arr[2]+"}");
    pe.changeValue(arr);
    System.out.println("Now : {" + arr[0] + ","+arr[1]+","+arr[2]+"}");
    }
    }
    
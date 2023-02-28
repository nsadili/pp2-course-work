class TestClass1 {
    int a, b;

public int TestClass() { 
    a = 10; b = 15; 
    return a;
}
public int TestClass(int a) { 
    this.a = a; b = 15; 
    return a;
}
public int TestClass(int a, int b) { 
    this.a = a; this.b = b; 
    return a;
}

public static void main(String[] args) {
    TestClass tc = new TestClass();
}
 }
    
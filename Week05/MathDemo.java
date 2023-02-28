class MathDemo {
    private int a, b;

    public MathDemo(){

    }

    public MathDemo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int min(int a, int b){
        if(a < b) return a;
        else if(b < a) return b;
        else return 1;
    }

    public int max(int a, int b){
        if(a > b) return a;
        else if(b > a) return b;
        else return 1;
    }

    public int sum(int[] args){
        int sum = 0;
        for(int i = 0; i < args.length; i++){
            sum += args[i];
        }
        return sum;
    }

    public float mean(int[] args){
        float sum = 0, c =0;
        for(int i = 0; i < args.length; i++){
            sum += args[i];
            c++;
        }
        return sum / c;
    }

    public int factorial(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= n;
        }
        return fact;
    }
    
}

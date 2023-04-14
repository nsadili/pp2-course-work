public class MathDemo{
    int a;
    int b;
    int n;
    int[] args;
    public MathDemo(int a, int b, int n, int[] args) {
        this.a = a;
        this.b = b;
        this.n = n;
        this.args = args;
    }
    public int min(int a,int b){
        if(a<b) return a; else return b; 
    }
    public int max(int a,int b){
        if(a<b) return b; else return a; 
    }
    public int sum(int[] args){
        int sum=0;
        for(int i=0;i<args.length;i++){
            sum+=args[i];
        } 
        return sum;
    }
    public float mean(int[] args){
        float sum=0f;
        for(int i=0;i<args.length;i++){
            sum+=args[i];
        } 
        sum/=args.length;
        return sum;
    }
    public int factorial(int n){
        int sum=1;
        for(int i=1;i<=n;i++){
        sum*=i;
        }
        return sum;
    }
}
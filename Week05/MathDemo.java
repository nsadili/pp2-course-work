public class MathDemo {
    public int min(int a,int b){
        if (a>b) return b;
        else return a;
    }
    public int max(int a,int b){
        if (a<b) return b;
        else return a;
    }
    
    public int sum(int[] args){
        int sum=0;
        for(int i:args){
            sum+=args[i];
        }
        return sum;
    }

    public float mean(int[] args){
        int sum=0;
        int cnt=0;
        for(int i:args){
            sum+=args[i];
            cnt++;
        }
        return (float) sum/cnt;
    }

    public int factorial(int n){
        int fact=1;
        while(n>0){
            fact*=n--;
        }
        return fact;
    }

}

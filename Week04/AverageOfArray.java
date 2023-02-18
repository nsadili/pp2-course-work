public class AverageOfArray {
    public static void main(String[] args) {
        int sum=0,cnt=0;
        double avg;
        int a[]={4,6,2,1,6,3,9,0,2,4};
        for(int x: a){
            sum+=x;
            cnt++;
        }
        avg=(float) sum/cnt;
        System.out.printf("%.2f",avg);
    }
}

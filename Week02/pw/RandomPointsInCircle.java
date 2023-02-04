public class RandomPointsInCircle {
    public static void main(String[] args) {

        var cnt=0;

        while(cnt==0){
            var x=Math.random();
            var y=Math.random();
            if(x*x+y*y<=1){
                System.out.printf("x: %f , y: %f\n",x,y);
                cnt++;
            }
        }
        System.out.println("Program is finished");


    }
}

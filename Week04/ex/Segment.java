import java.util.Scanner;

public class Segment {
        private double x1,x2,y1,y2;


        public static void main(String[] args) {
          
           

            Scanner sc=new Scanner(System.in);

            System.out.println("Please enter the number of segment:");

            int numberOfSegments=sc.nextInt();
            Segment[] s=new Segment[numberOfSegments];

            for(var i=0;i<numberOfSegments;i++){
                System.out.println("Please enter coordinates of segment: ");
                
                var x1=sc.nextDouble();
                var y1=sc.nextDouble();
                var x2=sc.nextDouble();
                var y2=sc.nextDouble();
                
                s[i]=new Segment(x1,y1,x2,y2);
                

            }

           Segment[] res= min(s);

           for(Segment ss:res){

            System.out.printf("(%.2f,%.2f) , (%.2f,%.2f)\n",ss.x1,ss.y1,ss.x2,ss.y2);

           }

          


        }

        private static Segment[] min(Segment[] s){
            var min=Double.MAX_VALUE;

          
            var num=0;
            int count=0;

            for(var i=0;i<s.length;i++){
                if(min>s[i].distance()) {
                    min=s[i].distance();
                    count=1;
                }else if(min==s[i].distance()){
                    count++;
                }
            }

            Segment[] res=new Segment[count];
            
            for(var i=0;i<s.length;i++){
                if(min==s[i].distance()) {
                   res[num]=s[i];
                    num++;

                }
            }


            return res;

        }


        public Segment(double x1,double y1,double x2,double y2){
            this.x1=x1;
            this.x2=x2;
            this.y1=y1;
            this.y2=y2;
        }

        private double distance(){

            var distance=Math.hypot((this.x2-this.x1), (this.y2-this.y1));
            return distance;

        }


}

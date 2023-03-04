import java.util.Scanner;

public class Segment {
    private double x1, x2, y1, y2;

    public Segment(double x1, double y1, double x2, double y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public static void main(String[] args) {
        System.out.print("Counts of Segments: ");
        Scanner sc = new Scanner(System.in);
        int say = sc.nextInt();
        Segment[] sg = new Segment[say];

        double X1,X2,Y1,Y2;

        for(int k=0; k<say; k++){
            System.out.print("Segment-"+(k+1)+" ");
            X1 = sc.nextDouble();
            Y1 = sc.nextDouble();
            X2 = sc.nextDouble();
            Y2 = sc.nextDouble();
            sg[k] = new Segment(X1,Y1,X2,Y2);
        }

        for(Segment ss: minLength(sg)){

            System.out.printf("(%.2f,%.2f) , (%.2f,%.2f)\n",ss.x1,ss.y1,ss.x2,ss.y2);

        }

    }

    public static Segment[] minLength(Segment[] qutu){
        double min= qutu[0].length();
        int sameCount=0;

        for(Segment s : qutu){
            if(min>s.length()){
                min = s.length();
                sameCount=1;
            }else if(min == s.length()){
                sameCount++;
            }
        }

        int a=0;
        Segment[] newqutu = new Segment[sameCount];
        for(var k=0;k<qutu.length;k++){
            if(min==qutu[k].length()) {
                newqutu[a]=qutu[k];
                a++;

            }
        }

        return newqutu;

    }
    public void show(){
        System.out.println(this.x1+" - "+this.y1+" - "+this.x2+" - "+this.y2);
    }

    public double length(){
        return Math.sqrt(Math.pow(this.x2-this.x1,2)+Math.pow(this.y2-this.y1,2));
    }

}

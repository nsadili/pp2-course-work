import java.util.Scanner;

public class Histogram {
    public static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Instert the number of students: ");
        int length = scan.nextInt();
        int Grades[] = new int[length];
        int cnt = 0;
        for (int i : Grades) {
            Grades[cnt++] = scan.nextInt();
        }
        int cnt0 = 0, cnt1 = 0, cnt2 = 0, cnt3 = 0, cnt4 = 0, cnt5 = 0, cnt6 = 0, cnt7 = 0, cnt8 = 0, cnt9 = 0,
                cnt10 = 0;
        for (int i : Grades) {
            switch (Grades[i]) {
                case 0:
                    cnt0++;
                    break;
                case 1:
                    cnt1++;
                    break;
                case 2:
                    cnt3++;
                    break;
                case 3:
                    cnt3++;
                    break;
                case 4:
                    cnt4++;
                    break;
                case 5:
                    cnt5++;
                    break;
                case 6:
                    cnt6++;
                    break;
                case 7:
                    cnt7++;
                    break;
                case 8:
                    cnt8++;
                    break;
                case 9:
                    cnt9++;
                    break;
                case 10:
                    cnt10++;
                    break;
            }
        }
        int mode=cnt0;
        if(mode<cnt1) mode=cnt1;
        if(mode<cnt2) mode=cnt2;
        if(mode<cnt3) mode=cnt3;
        if(mode<cnt4) mode=cnt4;
        if(mode<cnt5) mode=cnt5;
        if(mode<cnt6) mode=cnt6;
        if(mode<cnt7) mode=cnt7;
        if(mode<cnt8) mode=cnt8;
        if(mode<cnt9) mode=cnt9;
        if(mode<cnt10) mode=cnt10;
        cnt=0;
        double mean=0;
        for(int i : Grades){
            mean+=Grades[cnt++];
        }
        mean/=cnt;
        
    }

}

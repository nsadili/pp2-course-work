public class Triangle {
    int a;
    int b; 
    int c; 


     public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
     }

        public int getA() {
        return a;
    }

    
        public void setA(int a) {
            this.a = a;
        }


        public int getB(int b) {
            return b;
        }


        public void setB(int b) {
            this.b = b;
        }


        public int getC(int c) {
            return c;
        }

        public void setC(int c) {
            this.c = c;
        }



        public double areaTriangle() {
            
            double p = (this.a + this.b + this.c) / 2.0;
            double x = p * (p - this.a) * (p - this.b) * (p - this.c);
            double area = Math.sqrt(x);

            return area;
            
        }

        


    
}

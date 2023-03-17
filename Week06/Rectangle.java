package Week06;

import java.util.Objects;

public class Rectangle implements Cloneable {
        private int a;
        Long b;
    
        public Rectangle(int a, int i) {
            this.a = a;
            this.b = b;
        }
    
        public String toString() {
            return a + " " + b;
        }
    
        public void set(int a, Long b) {
            this.a = a;
            this.b = b;
        }
    
        public boolean equals(Object obj) {
            // TODO
            if (obj == null )  return false;
            if (!(obj instanceof Rectangle)) return false;
            Rectangle rect = (Rectangle) obj;
            return (Objects.equals(rect.a, this.a) && Objects.equals(rect.b, this.b));
            
        }
    
        // TODO: override clone() method
        @Override
        public Object clone() throws CloneNotSupportedException {
            Rectangle copy = (Rectangle) super.clone(); 
            copy.b = new Long(this.b);
            return copy; 
        }
        
    
    }

package Week07;
import java.util.List;

public class Ex5 {
    class Customer {
        private int ID;
        private String name;
        private char gender;
        private int discount;
        private List<String> roles;

        public Customer(int ID, String name, char gender, int discount, List<String> roles) {
            this.ID = ID;
            this.name = name;
            this.gender = gender;
            this.discount = discount;
            this.roles = roles;
        }

        public int getID() {
            return ID;
        }

        public String getName() {
            return name;
        }

        public char getGender() {
            return gender;
        }

        public int getDiscount() {
            return discount;
        }

        public void setDiscount(int discount) {
            this.discount = discount;
        }

        public List<String> getRoles() {
            return roles;
        }

        public void setRoles(List<String> roles) {
            if (roles == null || roles.isEmpty()) {
                throw new IllegalArgumentException("Roles list cannot be null or empty.");
            }
            this.roles = roles;
        }

        public String toString() {
            return name + "(" + ID + ")";
        }
    }
}

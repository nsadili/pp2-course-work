package Week05.EX;

import java.util.List;

public class Inheritance {
        private String firstName;
        private String lastName;
        private String gender;
        
        public Inheritance(String firstName, String lastName, String gender) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.gender = gender;
        }
        
        public String getFirstName() {
            return firstName;
        }
        
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
        
        public String getLastName() {
            return lastName;
        }
        
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
        
        public String getGender() {
            return gender;
        }
        
        public void setGender(String gender) {
            this.gender = gender;
        }
        
        public String toString() {
            return firstName + " " + lastName + " (" + gender + ")";
        }
        
        public boolean equals(Inheritance p) {
            if (p == null) {
                return false;
            }
            if (p == this) {
                return true;
            }
            return this.firstName.equals(p.firstName) &&
                   this.lastName.equals(p.lastName) &&
                   this.gender.equals(p.gender);
        }
        public class Teacher extends Inheritance {
            private String department;
            private List<String> courses;
            
            public Teacher(String firstName, String lastName, String gender, String department, List<String> courses) {
                super(firstName, lastName, gender);
                this.department = department;
                this.courses = courses;
            }
            
            public String getDepartment() {
                return department;
            }
            
            public void setDepartment(String department) {
                this.department = department;
            }
            
            public List<String> getCourses() {
                return courses;
            }
            
            public void setCourses(List<String> courses) {
                this.courses = courses;
            }
            
            public String toString() {
                return super.toString() + ", " + department + " department, courses: " + courses.toString();
            }
            
            public boolean equals(Teacher t) {
                if (t == null) {
                    return false;
                }
                if (t == this) {
                    return true;
                }
                return super.equals(t) &&
                       this.department.equals(t.department) &&
                       this.courses.equals(t.courses);
            }
        }
    }
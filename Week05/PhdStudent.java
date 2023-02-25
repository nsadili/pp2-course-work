public class PhdStudent extends Student {
 
        public String department;
        private String[] courses=new String[10];
    
        
    
        
    
        public PhdStudent(String firstName, String lastName, String gender, int studentId, String department,
                String[] courses) {
            super(firstName, lastName, gender, studentId);
            this.department = department;
            this.courses = courses;
        }

        public String getDepartment() {
            return department;
        }
    
        public void setDepartment(String department) {
            this.department = department;
        }
    
        public String[] getCourses() {
            return courses;
        }
    
        public void setCourses(String[] courses) {
            this.courses = courses;
        }
        
        public String toString(){
            return "Full name: "+ super.firstName+" Gender: "+super.gender+
            " Department: "+ department+" Courses: "+courses; 
        }
        public boolean equals(PhdStudent pStud){
            if(pStud.department==this.department && pStud.courses[1]==this.courses[1] &&
            pStud.courses[3]==this.courses[3] &&pStud.courses[3]==this.courses[3] &&
            pStud.courses[4]==this.courses[4] &&pStud.courses[5]==this.courses[5] &&
            pStud.courses[6]==this.courses[6] &&pStud.courses[7]==this.courses[7] &&
            pStud.courses[9]==this.courses[9] &&pStud.courses[0]==this.courses[0] ) return true;
            else return false;
        }
    }
    
    
}

class Student extends Person {

    private String studentId;


        public Student(String firstName, String lastName, String gender, String studentId){
            super(firstName, lastName, gender);

            this.studentId = studentId;
        }

        public Student(Student s) {
            this(s.getFirstName(), s.getLastName(), s.getGender(), s.getStudentId());
        }


        public String getStudentId() {
            return studentId;
        }


        public void setStudentId(String studentId) {
            this.studentId = studentId;
        }
        
        public String toString() {
            return super.toString() + ", student ID: " + this.studentId;
        }
        public boolean equals(Student s) {
            return super.equals(s) && this.studentId == s.getStudentId();
        }

    
}

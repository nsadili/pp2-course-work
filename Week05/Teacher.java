class Teacher extends Person {
    
    public String department;
    private String[] courses=new String[10];

    

    public Teacher(String firstName, String lastName, String gender, String department, String[] courses) {
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
    public boolean equals(Teacher t){
        if(t.department==this.department && t.courses[1]==this.courses[1] &&
        t.courses[3]==this.courses[3] &&t.courses[3]==this.courses[3] &&
        t.courses[4]==this.courses[4] &&t.courses[5]==this.courses[5] &&
        t.courses[6]==this.courses[6] &&t.courses[7]==this.courses[7] &&
        t.courses[9]==this.courses[9] &&t.courses[0]==this.courses[0] ) return true;
        else return false;
    }
}

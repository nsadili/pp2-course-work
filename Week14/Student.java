public class Student {
    private String fname;
    private String lname;
    private Double id;
    private Double GPA;
    private String birthday;
    
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public Double getId() {
        return id;
    }
    public void setId(Double id) {
        this.id = id;
    }
    public Double getGPA() {
        return GPA;
    }
    public void setGPA(Double gPA) {
        GPA = gPA;
    }
    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    
    public Student(String fname, String lname, Double id, Double gPA, String birthday) {
        this.fname = fname;
        this.lname = lname;
        this.id = id;
        GPA = gPA;
        this.birthday = birthday;
    }
    public Student(String string, String string2, int i) {
    }
    @Override
    public String toString() {
        return "Student [fname=" + fname + ", lname=" + lname + ", id=" + id + ", GPA=" + GPA + ", birthday=" + birthday
                + "]";
    }

    public static void main(String[] args) {
        Student person1 = new Student("Fidan", "Mammedova", 17525);

        System.out.println( person1.getClass().getFields());

    }
}

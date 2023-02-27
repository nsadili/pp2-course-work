public Person(String firstName, String lastName, String gender) {
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
    return "Person's first name is " + this.firstName + ", person's surname is " + this.lastName + ", person's gender is " + this.gender;             
}

public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (!(obj instanceof Person)) {
        return false;
    }
    Person person = (Person) obj;
    return this.firstName.equals(person.firstName) && this.lastName.equals(person.lastName) && this.gender.equals(person.gender);
}

public Teacher(String firstName, String lastName, String gender, String department, String courses) {
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

public String getCourses() {
    return courses;
}

public void setCourses(String courses) {
    this.courses = courses;
}

public String toString() {
    return super.toString() + ", department is " + this.department + ", courses are " + this.courses; 
}

public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (!(obj instanceof Teacher)) {
        return false;
    }
    Teacher teacher = (Teacher) obj;
    return super.equals(obj) && this.department.equals(teacher.department) && this.courses.equals(teacher.courses);
}

public Student(String firstName, String lastName, String gender, int studentId) {
    super(firstName, lastName, gender);
    this.studentId = studentId;
}

public int getStudentId() {
    return studentId;
}

public void setStudentId(int studentId) {
    this.studentId = studentId;
}

public String toString() {
    return super.toString() + ", id is " + this.studentId;
}

public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (!(obj instanceof Student)) {
        return false;
    }
    Student student = (Student) obj;
    return super.equals(obj) && this.studentId == student.studentId;
}

public PhdStudent(String firstName, String lastName, String gender, int studentId, String department, String[] courses) {
    super(firstName, lastName, gender, studentId);
    this.department = department;
    this.courses = courses;
}

public String getDepartment() {
    return department;
}

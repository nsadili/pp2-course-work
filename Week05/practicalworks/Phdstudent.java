package Week05.practicalworks;
import java.util.Objects;

public class Phdstudent  extends Student {
    private String department;
	private String[] courses;

	public void PhdStudent(String firstName, String lastName, String gender, int studentId, String department,
			String[] strings) {
		super(firstName, lastName, gender, studentId);
		this.department = department;
		this.courses = strings;
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

	@Override
	public String toString() {
		return "PhdStudent{" + "firstName='" + getFirstName() + '\'' + ", lastName='" + getLastName() + '\''
				+ ", gender='" + getGender() + '\'' + ", studentId=" + getStudentId() + ", department='" + department
				+ '\'' + ", courses=" + courses + '}';
	}

	public boolean equals(PhdStudent pStud) {
		return super.equals(pStud) && Objects.equals(department, pStud.department)
				&& Objects.equals(courses, pStud.courses);
	}
}

package exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Grades {
	public static void main(String[] args) {

		Map<String, Double> studentGpaMap = new HashMap<>();

		studentGpaMap.put("Huseyn", 3.9);
		studentGpaMap.put("Ali", 3.6);
		studentGpaMap.put("Fuad", 3.8);
		studentGpaMap.put("Zakir", 3.5);

		List<String> topStudents = new ArrayList<>();
		
		double highestGpa = Double.MIN_VALUE;

		for (Map.Entry<String, Double> entry : studentGpaMap.entrySet()) {
			if (entry.getValue() > highestGpa) {
				topStudents.clear();
				topStudents.add(entry.getKey());
				highestGpa = entry.getValue();
			} else if (entry.getValue() == highestGpa) {
				topStudents.add(entry.getKey());
			}
		}

		System.out.println("Student/Students with the highest GPA: " + topStudents);

		System.out.println("************************************************");
		
		double totalGpa = 0;
		for (double gpa : studentGpaMap.values()) {
			totalGpa += gpa;
		}

		double averageGpa = totalGpa / studentGpaMap.size();
		
		System.out.println("Average GPA: " + averageGpa);
		
		System.out.println("************************************************");

		int numStudentsBelowAverage = 0;
		
		for (double gpa : studentGpaMap.values()) {
			if (gpa < averageGpa) {
				numStudentsBelowAverage++;
			}
		}

		System.out.println("Number of students with less GPA than average: " + numStudentsBelowAverage);
	}
}

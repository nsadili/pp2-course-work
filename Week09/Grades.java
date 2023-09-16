package week09codes;

import java.util.*;

public class Grades {
	public static void main(String[] args) {

		Map<String, Double> studentGpaMap = new HashMap<>();

		studentGpaMap.put("Zakir", 3.9);
		studentGpaMap.put("Huseyn", 3.6);
		studentGpaMap.put("Leyla", 3.8);
		studentGpaMap.put("Ceyran", 3.5);

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

		System.out.println("Student(s) with the highest GPA: " + topStudents);

		double totalGpa = 0;
		for (double gpa : studentGpaMap.values()) {
			totalGpa += gpa;
		}

		double averageGpa = totalGpa / studentGpaMap.size();
		System.out.println("Average GPA: " + averageGpa);

		int numStudentsBelowAverage = 0;
		for (double gpa : studentGpaMap.values()) {
			if (gpa < averageGpa) {
				numStudentsBelowAverage++;
			}
		}

		System.out.println("Number of students with less GPA than average: " + numStudentsBelowAverage);
	}
}
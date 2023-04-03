package week09codes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Map<String, Double> students = new HashMap<>();
		Scanner scn = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {

			String s = scn.next();
			Double gpa = scn.nextDouble();
			students.put(s, gpa);
		}

		Double max = 0.0;
		for (String name : students.keySet()) {
			if (students.get(name) > max)
				max = students.get(name);
		}
		Double sum = 0.0;

		for (Map.Entry<String, Double> entry : students.entrySet()) {
			String key = entry.getKey();
			Double value = entry.getValue();
			sum += value;
			if (value.equals(max)) {
				System.out.println("Key : " + key + ", Value : " + value);
			} // Shahmar 0 participation
		}

		Double ave = sum / students.size();

		System.out.println("\nLower than the average\n");
		System.out.println(findNumberOfStudentsLowerThanAverage(students, ave));
	}

	public static HashMap<String, Double> findNumberOfStudentsLowerThanAverage(Map<String, Double> hm, Double ave) {
		int count = 0;

		HashMap<String, Double> stds = new HashMap<>();

		for (Map.Entry<String, Double> entry : hm.entrySet()) {
			String key = entry.getKey();
			Double value = entry.getValue();
			if (value - ave < 0) {
				count += 1;
				stds.put(key, value);
			}
		}

		return stds;
	}
}
package com.assignments.java8Feature.streamApi;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class StudentMarks {

	public static void main(String[] args) {
		Student s = new Student(11, LocalDateTime.now(), LocalDateTime.of(2002, 04, 24, 8, 30), 56, 66, 70, 75, 80,
				"10th");

		Student s1 = new Student(22, LocalDateTime.now(), LocalDateTime.of(2005, 07, 15, 10, 30), 80, 86, 95, 90, 92,
				"10th");

		Student s2 = new Student(33, LocalDateTime.now(), LocalDateTime.of(2010, 04, 24, 8, 30), 34, 60, 70, 70, 80,
				"10th");

		Student s3 = new Student(44, LocalDateTime.now(), LocalDateTime.of(2002, 04, 24, 8, 30), 50, 44, 22, 33, 44,
				"10th");

		List<Student> list = Arrays.asList(s, s1, s2, s3);

		int avg1 = (s.getChemistry() + s.getEnglish() + s.getMaths() + s.getHindi() + s.getPhysics()) / 5;

		int avg2 = (s1.getChemistry() + s1.getEnglish() + s1.getMaths() + s1.getHindi() + s1.getPhysics()) / 5;

		int avg3 = (s2.getChemistry() + s2.getEnglish() + s2.getMaths() + s2.getHindi() + s2.getPhysics()) / 5;

		int avg4 = (s3.getChemistry() + s3.getEnglish() + s3.getMaths() + s3.getHindi() + s3.getPhysics()) / 5;

		Map<Student, Integer> map = new HashMap<>();
		map.put(s, avg1);
		map.put(s1, avg2);
		map.put(s2, avg3);
		map.put(s3, avg4);

		// 1. WAP to print list of all students who�s total marks are less than 40%.
		System.out.println("1...........................");
		List<Student> list2 = map.entrySet().stream().filter(stu -> stu.getValue() < 40).map(Map.Entry::getKey)
				.collect(Collectors.toList());

		for (Student student : list2) {
			System.out.println(student);
		}

		// 2. WAP to print list of all those students who scored more than 75% in any of
		// 3 subjects.

		// 3. WAP to print list of all those students who scored more than 75% in all
		// subjects.
		System.out.println("3...........................");
		List<Student> list3 = list.stream().filter(m -> m.getChemistry() > 75 && m.getMaths() > 75
				&& m.getPhysics() > 75 && m.getHindi() > 75 && m.getEnglish() > 75).collect(Collectors.toList());
		for (Student student : list3) {
			System.out.println(student);
		}

		// 4. WAP to find those students who are fail in at least one subject.
		System.out.println("4.............................");
		List<Student> list4 = list.stream().filter(m -> m.getChemistry() < 35 || m.getMaths() < 35
				|| m.getPhysics() < 35 || m.getHindi() < 35 || m.getEnglish() < 35).collect(Collectors.toList());
		for (Student student : list4) {
			System.out.println(student);
		}

		// 5. Find how many students are promoted to another class.
		System.out.println("5..............................");
		List<Entry<Student, Integer>> list5 = map.entrySet().stream().filter(n -> n.getValue() > 40)
				.collect(Collectors.toList());
		for (Entry<Student, Integer> entry : list5) {

			System.out.println(entry.getKey());

		}

	}

}

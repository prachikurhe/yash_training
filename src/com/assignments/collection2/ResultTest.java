package com.assignments.collection2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ResultTest {
	public static void main(String[] args) {
		System.out.println(".....EXAM PORTAL....");
		Student s = new Student(101, "shubham", "java", 490);
		Student s1 = new Student(105, "abhi", ".net", 330);
		Student s2 = new Student(104, "vijay", "python", 420);
		Student s3 = new Student(106, "kunal", "aws", 220);
		List<Student> list = Arrays.asList(s, s1, s2, s3);
		list.stream().sorted((o1,o2)->o2.getTotalMarks()-o1.getTotalMarks()).limit(3).forEach(System.out::println);
//		System.out.println(list);

		for (Student student : list) {
			int avg = (student.getTotalMarks() * 100 / 500);
		//	System.out.println(avg);

			if (avg < 50 && avg > 35) {
				System.out.println("student name who score between 50% to 35 %  :" + student.getName());
			} else if (avg < 35) {
				System.out.println("student name who score below 35%  :" + student.getName());
			} else if (avg > 75) {
				System.out.println("student name who score above 75%  :" + student.getName());
			}
		}
		System.out.println("==============================================");
		list.stream().sorted((a,b)->b.getTotalMarks()-a.getTotalMarks()).limit(2).forEach(System.out::println);
		for (Student student : list) {
			System.out.println(student);
		}
		//System.out.println("First Rank Student is :- "+first.get().getName()+" with totalMarks are : "+first.get().getTotalMarks());
	}
}

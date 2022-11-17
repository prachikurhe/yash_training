package com.assignments.collection1;

/*7) WAP to store the student class objects in List. Student class structure :- 
Student{ 
 int rollno;
 String sname, classname;
 String totalmarks; // marks out of 500, total five subjects each subject marks 100. 
 }
On the basis of the detail entered by the user. Now you have to perform the following 
operations. 
a) Print the name of students who secure first, second and third position. 
b) Print name of those students who’s marks are below 50%.
c) Print name of those students who’s marks are below 35% it means they are 
fail.
d) Print name of those students who’s marks are above average score. 
e) Print detail of all students on the basis of Name 
*/
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class Student implements Comparable<Student> {
	int rollNo;
	String sname, className;
	String totalMarks;

	public Student(int rollNo, String sname, String className, String totalMarks) {
		super();
		this.rollNo = rollNo;
		this.sname = sname;
		this.className = className;
		this.totalMarks = totalMarks;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", sname=" + sname + ", className=" + className + ", totalMarks="
				+ totalMarks + "]";
	}

	@Override
	public int compareTo(Student o) {
		int nameVal= this.sname.compareTo(o.sname) ;
		return nameVal;
	}

}

public class Student_Seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1, "Priya", "10", "400");
		Student s2 = new Student(2, "Neha", "12", "340");
		Student s3 = new Student(3, "Niki", "10", "350");
		Student s4 = new Student(4, "Aniket", "12", "450");
		Student s5 = new Student(5, "Tushar", "10", "350");

		List<Student> studentList = Arrays.asList(s1, s2, s3, s4, s5);
		//e) Print detail of all students on the basis of Name 
		Collections.sort(studentList);
		for(Student s:studentList) {
			System.out.println(s);
		}
		


	}

}

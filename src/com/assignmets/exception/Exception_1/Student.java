/*1) WAP to take student marks of different subject in class StudentResult which is associated with
 
Student class in following way:-
Class Student
{
 Int rollno;
 String sname;
String saddress;
StudentResult srobj;
Setter and getter for all class variable.
}
Create your own Exception class with name ResultException. This exception will be thrown when 
user is failed in more than 1 subject. 
You also need to throw exception when user mistakenly input the negative marks. 
If user total score is less than 40% you need to through fail exception.
*/

package com.assignmets.exception.Exception_1;
import java.util.Arrays;
import java.util.List;

class ResultException extends RuntimeException {
	String msg;

	public ResultException(String message) {
		super(message);
	}

}

class StudentResult {
	private List<Integer> marks;

	public StudentResult(List<Integer> marks) {
		super();
		this.marks = marks;
	}

	public List<Integer> getMarks() {
		return marks;
	}

	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}

}

public class Student {
	int rollNo;
	String sName;
	String sAddress;
	StudentResult srobj;

	public Student(int rollNo, String sName, String sAddress, StudentResult srobj) {
		super();
		this.rollNo = rollNo;
		this.sName = sName;
		this.sAddress = sAddress;
		this.srobj = srobj;
		this.validateStudent();
	}

	private void validateStudent() {
		// TODO Auto-generated method stub
		int sum = 0;
		int failedSub = 0;
		List<Integer> marks = this.srobj.getMarks();
		for (int subMarks : marks) {
			if (subMarks < 0) {
				throw new ResultException("Students marks invalid");
			}
			sum = sum + subMarks;
			if (subMarks < 40) {
				failedSub++;
			}

		}
		int average = sum / marks.size();

		if (failedSub >= 2) {
			throw new ResultException("student failed in more than two subjects");
		} else if (average < 40) {
			throw new ResultException("student failed");
		}

	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsAddress() {
		return sAddress;
	}

	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}

	public StudentResult getSrobj() {
		return srobj;
	}

	public void setSrobj(StudentResult srobj) {
		this.srobj = srobj;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			StudentResult sr1 = new StudentResult(Arrays.asList(-1, 76, 86, 75, 77));
			Student s1 = new Student(1, "Ram", "Nagpur", sr1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			StudentResult sr2 = new StudentResult(Arrays.asList(39, 39, 86, 75, 77));
			Student s2 = new Student(2, "Shyam", "Nashik", sr2);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			StudentResult sr3 = new StudentResult(Arrays.asList(40, 40, 40, 11, 40));
			Student s3 = new Student(2, "Neha", "Nashik", sr3);
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}

package com.assignments.class_object;

/*2) Design a class that can be used by a health care professional to keep track of a patient’s vital statistics. 
 The following are the details.

Name of the class - Patient

Member Variables - patientName(String),height(double),weight(double)

Member Function - double computeBMI()

The above method should compute the BMI and return the result. The formula for computation of BMI  
is weight (in kg) ÷ height*height(in metres).

Create an object of the Patient class and check the results.
*/
public class Patient {
	String patientName;
	double height;
	double weight;
	
	
	public Patient(String patientName, double height, double weight) {
		this.patientName = patientName;
		this.height = height;
		this.weight = weight;
	}

	double computeBMI() {
		double result = 0;
		result=weight/(height*height);
		
		return result;
		
	}

	public static void main(String[] args) {
		Patient patient=new Patient("Aniket",6.5,70 );
		Patient patient2=new Patient("Sachin",6.7, 65);
		System.out.println(patient.computeBMI()+"kg/m^2");
		System.out.println(patient2.computeBMI()+"kg/m^2");

	}

}

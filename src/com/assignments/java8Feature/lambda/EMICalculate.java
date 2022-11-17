package com.assignments.java8Feature.lambda;

import java.util.Scanner;

interface Calculate{
    
    void print();
    
}
public class EMICalculate {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        Calculate c =()-> {    
    
    System.out.println("Enter amount:");
    double amount=scan.nextDouble();
    System.out.println("Enter Months:");
    int months=scan.nextInt();
    System.out.println("Enter rate of intrest in number:");
    double roi=scan.nextDouble()/(12*100);


        double cal=(amount * roi *Math.pow (1 + roi,months))/(Math.pow(1 + roi,months)- 1);
        System.out.println("payable amount monthly = "+cal);
        System.out.println("total amount on monthly basis = "+cal*months);
    };
    c.print();
	}

}

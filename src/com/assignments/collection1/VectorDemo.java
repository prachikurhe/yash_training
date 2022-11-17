package com.assignments.collection1;

import java.util.Collections;
import java.util.Vector;

/*5) WAP to store data related to item in Vector and after that sort the data. 
*/
public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vec_tor=new Vector<>();
		vec_tor.add(12); 
        vec_tor.add(23); 
        vec_tor.add(22); 
        vec_tor.add(10); 
        vec_tor.add(20);
        System.out.println(vec_tor);
        Collections.sort(vec_tor);
        System.out.println("After sorting data in vector:"+vec_tor);
	}

}

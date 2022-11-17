package com.assignments.string;
/*WAP to demonstrate how garbage collector work when any memory is not referenced by string object.
 * *
 */

public class GarbageCollector {
	public void finalize() {
		System.out.println("object is garbage collected");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageCollector s1 = new GarbageCollector();
		GarbageCollector s2 = new GarbageCollector();
		s1 = null;
		s2 = null;
		System.gc();

	}

}

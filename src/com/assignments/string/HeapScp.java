package com.assignments.string;
/*6   WAP to demonstrate how memory is allocated to string objects in memory heap and string constant pool.
 * 
 */
public class HeapScp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Prachi");
		String s2=new String("Prachi");
		System.out.println(s1==s2);
		
		String s3=new String("Kurhe");//Heap
		String s4=s3.intern();//scp
		System.out.println(s3==s4);
		String s5="Kurhe";
		System.out.println(s4==s5);
		

	}

}

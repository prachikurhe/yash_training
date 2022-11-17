package com.assignments.array;

/* WAP to create a dynamic array. Dynamic Array means when user want to input
 * the number more than size of array it will increase the size of array without 
 * throwing exception.
	
   An Array contain the n numbers you have to find out combination which satisfy
    Pythagoras Template. ( Pythagoras templates:- 3*3+4*4==5*5)
	*/
class Array {
	private int arr[];
	private int count;

	public Array(int length) {
		arr = new int[length];
	}

	
	public int[] printArray() {

		for (int i = 0; i < count; i++) {

			System.out.print(arr[i] + " ");
		}
		return arr;
	}
	static void printPythagoreanTriplets(int[] array){
        int i,j,k;
        int x,y,z;
       
        for(i=0;i<array.length;i++){
            x=array[i];
            for(j=0;j<array.length;j++){
                y=array[j];
                for(k=0;k<array.length;k++){
                    z=array[k];
                    if((z*z)==(x*x + y*y)){
                       
                        System.out.println("Pythagoras template--"+x+", "+y+", "+z);
                        
                    }
                }
            }
        }
    }

	
	public void insert(int element) {

		if (arr.length == count) {

			int newArr[] = new int[2 * count];

			for (int i = 0; i < count; i++) {
				newArr[i] = arr[i];
			}
			arr = newArr;
		}

		arr[count++] = element;
	}
}
public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array numbers = new Array(3);
		numbers.insert(1);
		numbers.insert(2);
		numbers.insert(3);
		numbers.insert(4);
		
		numbers.printArray();
		int[]array=	numbers.printArray();
		Array.printPythagoreanTriplets(array);
		

		
		
		

	}

}

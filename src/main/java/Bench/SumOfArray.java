package Bench;

import java.util.Arrays;

/*</code>Write a function that finds the sum of an array. Make your function recursive.
Examples
<code>sum([1, 2, 3, 4]) ➞ 10sum([1, 2]) ➞ 3sum([1]) ➞ 1sum([]) ➞ 0</code>Notes
Return 0 for an empty array.*/

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testArray = {1, 2, 3, 4};
		System.out.println("the sum of the array is " + sum(testArray));

	}

	private static Integer sum(int[] testArray) {
		// TODO Auto-generated method stub
		 if(testArray.length < 1) {
			 return 0;
		 }
		 else{
			 return testArray[testArray.length-1] + sum(Arrays.copyOf(testArray, testArray.length-1));
		 }
	}

}

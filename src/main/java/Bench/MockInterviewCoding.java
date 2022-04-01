package Bench;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class MockInterviewCoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("the reverse of a string is " + reverse("string"));
		System.out.println("Create a for loop that prints “hi” 10 times");
		printHi();
		//Create an array with numbers 1-10, print out only the even numbers
		System.out.println("print the even numbers");
		int [] a = new int[10];
		for (int i=0; i< a.length; i++) {
			a[i]=i;
		}
		ArrayList<Integer> evenNum=new ArrayList<Integer>(); 
		evenNum = evenNumbers(a);
		System.out.println(evenNum);
		
		System.out.println("Compare strings");
		boolean res = compareStrings("Hello Revature");
		System.out.println(res);

	}
	
	public static String reverse(String s) {
		String r ="";
		for (int i = s.length()-1; i>=0; i--) {
			r = r + s.charAt(i);
		}
		return r;	
	}
	
	public static void printHi() {
		for (int i =0; i<10; i++) {
			System.out.println("Hi");
		}
	}
	
	//Create an array with numbers 1-10, print out only the even numbers	
	public static ArrayList evenNumbers(int [] a){
		ArrayList<Integer> evenNum=new ArrayList<Integer>(); 
		for(int i = 0; i<a.length; i++) {
			if(a[i] % 2 != 0){
				evenNum.add(a[i]);
			}
		}
		return evenNum;
		
	}
	
	public static boolean compareStrings (String s) {
		if (s.equals("Hello Revature")) {
			return true;
		}else {
			return false;
		}
	}
}

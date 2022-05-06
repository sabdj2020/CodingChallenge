package Bench;

import java.util.ArrayList;

public class EvenOdd {
	
	
	public static void main(String []args) {
		int [] a = {1,2,5,6,3,4,8};
		
		System.out.println(sorted(a));
		
	}
	
	public static ArrayList<Integer> sorted(int [] a){
		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i =0; i<a.length; i++) {
			if(a[i]%2 == 0) {
				al.add(a[i]);
			}
		}
		for(int i=0; i<a.length; i++) {
			if(a[i]%2!=0) {
				al.add(a[i]);
			}
		}
		return al;
		
	}

}

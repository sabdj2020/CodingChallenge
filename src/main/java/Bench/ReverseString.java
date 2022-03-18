package Bench;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("the reverse of a string is" + reverse("string"));
		System.out.println("Create a for loop that prints “hi” 10 times");
		printHi();

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

}

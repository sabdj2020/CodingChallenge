package Bench;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse("car drive i"));

	}
	
	
	public static String reverse (String s) {
		String str ="";
		String[] a = s.split( " ", s.length());
		
		for (int i=a.length-1; i>=0; i--) {
			str = str + " " + a[i];
		}
		
		
		return str;
		
		
	}

}

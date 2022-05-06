package Bench;

public class UpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(upperCase("car drive i"));

	}
	public static String upperCase (String s) {
		String str ="";
		String[] a = s.split(" ", s.length());
		for (int i=a.length-1; i>=0; i--) {
		    Character.toUpperCase(a[i].charAt(0));
		    String w ="";
		    for (int j = 1; j<a[i].length(); j++) {
		    	w = w + a[i].charAt(j);
		    }
			str = str + " " + Character.toUpperCase(a[i].charAt(0)) + w  ;
		}
		
		
		return str;
		
		
	}

}

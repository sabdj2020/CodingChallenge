package Bench;


//https://gist.github.com/tanannis/5ab3e6fc59f4b278944ecad7a7fd061b

public class CheckStringPolyndrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPolyndrom("abba"));
		System.out.println(isPolyndrom("abca"));

	}
	
	public static boolean isPolyndrom(String s) {
		int i = 0;
		int j = s.length()-1;
		
		while(j>=0 & i<s.length()) {
			if(s.charAt(i)!=(s.charAt(j))) {
				return false;	
			}
			i++;
			j--;
		}
		return true;			
	}

}

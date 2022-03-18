package Bench;

public class ValidateString {
	
	public static Boolean checkValidString(String inputString) {
		 if (inputString =="" || inputString.length() < 4 || inputString.length() > 6 || inputString.length() == 5) {
	            return false;
	        }
		 else {
			 for (int i = 0; i<inputString.length();i++) {
					if(!Character.isDigit(inputString.charAt(i))) {
						return false;
					}
				}	 
		 }
		return true;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(checkValidString("121317"));
		System.out.println(checkValidString("1234"));
		System.out.println(checkValidString("45135"));
        System.out.println(checkValidString("89abc1"));
        System.out.println(checkValidString(""));
	}
}

package Bench;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isLeapYear(2023));

	}
	
	public static boolean isLeapYear(int year) {
		
		
		if(year%4 != 0) {
			return false;
		}
		return true;
		
	}

}

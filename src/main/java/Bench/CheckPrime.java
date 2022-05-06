package Bench;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPrime(122));

	}
	
	public static boolean isPrime(int n) {
		
		if (n==0 || n==1) {
			return false;
		}
		if(n==2) {
			return true;
		}
		
		for (int i = 2; i<n; i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
		
	}

}

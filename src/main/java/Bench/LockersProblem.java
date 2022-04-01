package Bench;

public class LockersProblem {

	    public static void main(String[] args) {
	        boolean[] lockers = new boolean[101];
	        for (int i = 1; i < lockers.length; i++) {
	            lockers[i] = true;
	        }
	        for (int i = 2; i <= 100; i++) {
	            for (int j = 1; i * j <= 100; j++) {
	                lockers[i * j] = (lockers[i * j] == true) ? false : true;
	            }
	        }
        	int open=0;
	        for (int i = 0; i < lockers.length; i++) {
	            if (lockers[i] == true) {
	                System.out.println("the locker number " + i + " is open.");
	                open ++;
	            }	            
	        }
	        System.out.println("the number of lockers open is: "+ open);
	    }
	}

package Bench;

import java.util.Arrays;

/*Take the number 192 and multiply it by each of 1, 2, and 3:
192 × 1 = 192
192 × 2 = 384
192 × 3 = 576
By concatenating each product, we get the 1 to 9 pandigital, 192384576. We will call 192384576 the concatenated product of 192 and (1,2,3)
The same can be achieved by starting with 9 and multiplying by 1, 2, 3, 4, and 5,giving the pandigital, 918273645, which is the concatenated product of 9 and(1,2,3,4,5).
What is the largest 1 to 9 pandigital 9-digit number that can be formed as the concatenated product of an integer with (1,2, ... , n) where n >1?*/

public class Pandigital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("the Pandigital is" + getPandigital(256));

	}
	
	public static long getPandigital(int pan) {
        long p= 0;
        String s="";
        for (int i = 0; i <10000; i++) {
            for (int j = 1; j <10000; j ++) {
                s = s + (i*j);
                if (s.length() > 9) 
                	break;
            }
            if(isPan(s)) p = Long.max(p, Long.parseLong(s));
        }
        return pan;
    }

    public static boolean isPan(String pan) {
        if (pan.length() != 9) 
        	return false;
        char[] charArray = pan.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray).equals("123456789");
    }

}

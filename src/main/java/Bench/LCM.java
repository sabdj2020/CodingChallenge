package Bench;

import java.util.HashMap;
import java.util.Map;

/*1) Create a function that takes an array of more than three numbers and returns the Least Common Multiple (LCM).

Examples:
lcmOfArray([5, 4, 6, 46, 54, 12, 13, 17]) ➞ 2744820

lcmOfArray([46, 54, 466, 544]) ➞ 78712992

lcmOfArray([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) ➞ 2520

lcmOfArray([13, 6, 17, 18, 19, 20, 37]) ➞ 27965340

Notes:
The LCM of an array of numbers is the smallest positive number that is divisible by each of the numbers in the array.

2) Given an integer value, return a new integer according to the rules below:

-Split the number into groups of two digit numbers. If the number has an odd number of digits, return -1.
-For each group of two digit numbers, concatenate the last digit to a new string the same number of times as the value of the first digit.
-Return the result as an integer.

lookAndSay(3132) ➞ 111222

// By reading the number digit by digit, you get three "1" and three "2".
// Therefore, you put three ones and three two's together.
// Remember to return an integer value (i.e BigIntger class).
Examples:
1) lookAndSay(1213200012171979) ➞ 23002799999999

2) lookAndSay(54544666) ➞ 44444444446666666666

3) lookAndSay(95) ➞ 555555555

4) lookAndSay(1213141516171819) ➞ 23456789

5) lookAndSay(120520) ➞ 200

6) lookAndSay(231) ➞ -1

Notes:
Note that the number 0 can be included (see example #5).*/

public class LCM {

	public static void main(String[] args) {
		int[] testArray = {5, 4, 6, 46, 54, 12, 13, 17};
        System.out.println("Least Common Multiple (LCM) " + lcm(testArray));
	}
	
	private static int lcm(int[] N) {
        Map<Integer, Integer> mapValues = new HashMap<Integer, Integer>();
        for (int i = 0; i < N.length; i++) {
            int n = N[i];
            for (int j = 2; j <= n; j++) {
                int t = 0;
                if (mapValues.containsKey(j)) {
                   t = mapValues.get(j);
                }
                while (n % j == 0) {
                    n = n/j;
                    if (t > 0) {
                        t=t-1;
                    } else if (mapValues.containsKey(j)){
                    	mapValues.replace(j, mapValues.get(j) + 1);
                    } else {
                    	mapValues.put(j, 1);
                    }
                }
            }
        }
        int output = 1;
        for (Map.Entry<Integer, Integer> input : mapValues.entrySet()) {
            output *= Math.pow(input.getKey(), input.getValue());
        }
        return output;
    }

}

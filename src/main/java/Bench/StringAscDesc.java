package Bench;

import java.util.HashMap;
import java.util.Map;

/*1) Write a function that returns true if a string consists of ascending or ascending AND consecutive numbers.
Examples
ascending("232425") --> true
// Consecutive numbers 23, 24, 25
ascending("2324256") --> false
// No matter how this string is divided, the numbers are not consecutive.
ascending("444445") --> true
// Consecutive numbers 444 and 445.
Notes
A number can consist of any number of digits, so long as the numbers are adjacent to each other, and the string has at least two of them.
2) Create a function that takes an integer and outputs an n x n square solely consisting of the integer n.
Examples
squarePatch(3) --> [
[3, 3, 3],
[3, 3, 3],
[3, 3, 3]
]
squarePatch(5) --> [
[5, 5, 5, 5, 5],
[5, 5, 5, 5, 5],
[5, 5, 5, 5, 5],
[5, 5, 5, 5, 5],
[5, 5, 5, 5, 5]
]
squarePatch(1) --> [
[1]
]
squarePatch(0) --> []
Notes
n >= 0.
If n = 0, return an empty array.*/

public class StringAscDesc {

	public static void main(String[] args) {
		int[] a = {5, 4, 6, 46, 54, 12, 13, 17};
        int[] b = {46, 54, 466, 544};
        int[] c = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] d = {13, 6, 17, 18, 19, 20, 37};
        System.out.println("test1 " + lcmOfArray(arr1));
        System.out.println("test2 " + lcmOfArray(arr2));
        System.out.println("test3 " + lcmOfArray(arr3));
        System.out.println("test4 " + lcmOfArray(arr4));
	}
	
	private static int lcmOfArray(int[] nums) {
        Map<Integer, Integer> primes = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            for (int j = 2; j <= num; j++) {
                int occurrences = 0;
                if (primes.containsKey(j)) {
                    occurrences = primes.get(j);
                }
                while (num % j == 0) {
                    num /= j;
                    if (occurrences > 0) {
                        occurrences--;
                    } else if (primes.containsKey(j)){
                        primes.replace(j, primes.get(j) + 1);
                    } else {
                        primes.put(j, 1);
                    }
                }
            }
        }
        int ans = 1;
        for (Map.Entry<Integer, Integer> entry : primes.entrySet()) {
            ans *= Math.pow(entry.getKey(), entry.getValue());
        }
        return ans;
    }

}

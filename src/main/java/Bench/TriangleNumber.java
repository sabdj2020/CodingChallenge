package Bench;

/*The sequence of triangle numbers is generated by adding the natural numbers. So the7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28.The first ten terms would be:
1, 3, 6, 10, 15, 21, 28,36, 45, 55, ...
Let us list the factors of the first seven triangle numbers:
1: 1
3: 1,3
6: 1,2,3,6
10: 1,2,5,10
15: 1,3,5,15
21: 1,3,7,21
28: 1,2,4,7,14,28
We can see that 28 is the first triangle number to have over five divisors.
What is the value of the first triangle number to have over five hundred divisors?*/

public class TriangleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num = triangleNum();
		System.out.println("Triangle number is " + num);


	}
	public static long triangleNum() {
		int num = 2;
		int numFactor = 0;
		long triangle = 0;
		
		do {
			triangle = num * (num + 1) / 2;
			int t = (int) Math.sqrt(triangle);
			for (int i = 2; i < t; i++) {
				if (triangle % i == 0)
					numFactor = numFactor + 2;
			}
			num++;
		}while (numFactor <= 500);

		return triangle;
	}	
}
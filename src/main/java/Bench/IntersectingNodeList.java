package Bench;

import java.util.LinkedList;

/*
 * Weekly Coding Challenge:
Pls provide the link to your solution in the comments section not later than Friday morning.

1) Given two singly linked lists that intersect at some point, find the intersecting node. Assume the lists are non-cyclical.

For example, given A = 3 ➔ 7 ➔ 8 ➔ 10 and B = 99 ➔ 1 ➔ 8 ➔ 10, return the node with value 8. In this example, assume nodes with the same value are the exact same node objects.

Do this in 0( m + n) time (where m and n are the lengths of the lists) and constant space.



Translate
*/
public class IntersectingNodeList {

public static void main(String[] args) {
	// TODO Auto-generated method stub
	LinkedList l1 = new LinkedList();  
	LinkedList l2 = new LinkedList(); 
	l1.add(3);
	l1.add(7);
	l1.add(8);
	l1.add(10);
	l2.add(99);
	l2.add(1);
	l2.add(8);
	l2.add(10);
	System.out.println(l1);
	System.out.println(l2);
	intersectListNode(l1, l2);

}

public static Integer intersectListNode(LinkedList l1, LinkedList l2) {
	for (int i = 0; i < l1.size(); i++) {
		for ()
        System.out.print(l2.get(i));
    }

	return null;
}
}


/*
To handle this problem, we will again use our favorite linked list tactic: iterating 
with two pointers. Let's start by first ignoring the time and space constraints, in 
order to get a better grasp of the problem.

Naively, we could iterate through one of the lists and add each node to a set. Then 
we could iterate over the other list and check each node to see if it is in the set, and 
return the first node present in the set. This takes O ( m + n) time and also O ( m + n) 
space (since we don't know initially which list is longer). How can we reduce the 
amount of space we need? 

We can get around the space constraint with the following trick: first, get the length 
of both lists. Find the difference between the two, and then keep two pointers at the 
head of each list. Move the pointer of the larger list up by the difference, and then 
move the pointers forward in conjunction until they match.

Implementing the stack part (push and pop) of this problem is easy - we can just 
use a typical list to implement the stack with append and pop. However, getting the 
max in constant time is a little trickier. We could do this in linear time if we popped off everything on the stack while keeping track of the maximum value, and then put 
everything back on.

To accomplish this in constant time, we can use a secondary stack that only keeps 
track of the max values at any time. It will have the exact same number of elements 
as our primary stack at any point in time, but the top of the stack will always contain 
the maximum value of the stack. 

We can then, when pushing, check if the element we're pushing is greater than the 
max value of the secondary stack (by just looking at the top), and if it is, then push 
that instead. If not, we append the previous value.

Daily-coding-problem-get-exceptionally-good-at-coding-interviews-by-solving-one-problem-every-day

*/


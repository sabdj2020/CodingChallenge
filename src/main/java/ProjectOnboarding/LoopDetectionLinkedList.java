package ProjectOnboarding;

/*
 * Loop Detection: Given a circular linked list, implement an algorithm that returns the node at the beginning of the loop.
DEFINITION:
Circular linked list: A (corrupt) linked list in which a node's next pointer points to an earlier node, so as to make a loop in the linked list.
EXAMPLE
Input: A -> B -> C -> D -> E -> C [the same C as earlier]
Output: C*/

public class LoopDetectionLinkedList {
	Node headList;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopDetectionLinkedList l = new LoopDetectionLinkedList();
		l.headList = new Node(1);
		Node e2 = new Node(2);
		Node e3 = new Node(3);
		Node e4 = new Node(4);
		l.headList.next = e2;
		e2.next = e3;
		e3.next = e4;
		e4.next = e2; //loop
		
		for(int i=1; i<=4; i++) {
			System.out.print(l.headList.value + " ");
			l.headList = l.headList.next;
		}

		boolean isLoop = l.isThereLoop();
		if (isLoop) {
			System.out.println("we found a loop in the given list");
		} else {
			System.out.println("no loop");
		}
	}


	public boolean isThereLoop() {
		Node first = headList;
		Node second = headList;

		while (first != null && first.next != null) {
			first = first.next.next;
			second = second.next;
			if (first != second) {
				return false;
			}
		}

		return true;
	}
	
	static class Node {
		int value;
		Node next;
		Node(int d) {
			value = d;
			next = null;
		}
	}

}

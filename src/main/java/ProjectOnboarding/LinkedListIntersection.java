package ProjectOnboarding;

/*
 * a) Intersection: Given two (singly) linked lists, 
 * determine if the two lists intersect. 
 * Return the intersecting node. 
 * Note that the intersection is defined based on reference, not value. 
 * That is, if the kth node of the first linked list is the exact same node (by reference) as the jth node of the second linked list, then they are intersecting.*/

public class LinkedListIntersection {
	private static Node headList1;
	private static Node headList2;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListIntersection l1 = new LinkedListIntersection();
		LinkedListIntersection l2 = new LinkedListIntersection();

		//List 1
		l1.headList1 = new Node(1);
		Node e12 = new Node(2);
		Node e13 = new Node(3);
		Node e14 = new Node(4);
		l1.headList1.next = e12;
		e12.next = e13;
		e13.next = e14;
		e14.next = e12; //loop
		
		//List 2
		l2.headList1 = new Node(1);
		Node e22 = new Node(2);
		Node e23 = new Node(3);
		Node e24 = new Node(4);
		l2.headList1.next = e22;
		e22.next = e23;
		e23.next = e24;
		e24.next = e22; //loop
		
		Node intesectedNode = l1.intersectedNode(headList1, headList2);
        if(intesectedNode!=null)
        {
            System.out.println("there is intersection: "+intesectedNode.value);
        }
        else
        {
            System.out.println("no intersection between the lists");
        }

	}
	 
	    public Node intersectedNode(Node l1, Node l2) {
	        int l1Length = 0;
	        int l2Length = 0;
	        Node n1=l1;
	        Node n2=l2;
	        if (n1 == null || n2 == null)
	            return null;
	 
	        // Find the length of both linked list
	        while(n1 != null){
	           
	        }
	        while(n2 !=null){
	        	 n2 = n1.next;
		         l2Length++;
	        }
	 
	        int lengthDiff = 0;
	        Node pointer1=l1;
	        Node pointer2=l2;
	 
	        // Find bigger linked list and iterate upto the different between two linked list.
	        if(l1Length > l2Length){
	        	lengthDiff = l1Length-l2Length;
	            int i=0;
	            while(i<lengthDiff){
	            	pointer1 = pointer1.next;
	                i++;
	            }
	        }else{
	        	lengthDiff = l2Length-l1Length;
	            int i=0;
	            while(i<lengthDiff){
	            	pointer2 = pointer2.next;
	                i++;
	            }
	        }
	 
	        // Iterate over both linked list and find the common node
	        while(pointer1 != null && pointer1 != null){
	            if(pointer1 == pointer2){
	                return pointer1;
	            }
	            pointer1 = pointer1.next;
	            pointer2 = pointer2.next;
	        }
	 
	        return null;
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

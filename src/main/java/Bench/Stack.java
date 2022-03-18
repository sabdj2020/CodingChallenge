package Bench;

/*
 * 2) Implement a stack that has the following methods:
• push ( v a 1 ) : push v a 1 onto the stack
• pop: pop off and return the topmost element of the stack. If there are no elements in the stack, throw an error.
• max: return the maximum value in the stack currently. If there are no elements in the stack, throw an error.

Each method should run in constant time.*/

public class Stack {
	private String a[];
	private int c;
	private int t;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack(3);
		System.out.println(" push v a 1 onto the stack");
		s.push("v");
		s.push("a");
		s.push("1");
		System.out.println("pop off and return the topmost element of the stack. If there are no elements in the stack, throw an error");
		s.pop();
		System.out.println("return the maximum value in the stack currently. If there are no elements in the stack, throw an error.");
		s.maxValue();
	}

	// initialize the stack
	public Stack(int s) {
		a = new String[s];
		c = s;
		t = -1;
	}
	// add elements
	public void push(String element) {
		if (!isFull()) {
			System.out.println("adding element into the stack " + element);
			a[++t] = element;
		} else {
			// Block of code to handle errors
			System.out.println("stack overflow");
			System.exit(-1);
		}
	}

	// pop a top element from the stack
	public String pop() {
		// check for stack not empty to pop
		if (!isEmpty()) {
			System.out.println("Removing the top element " + peek());
		} else {
			System.out.println("Stack underflow");
			System.exit(-1);
		}

		// when the popped element is removed decrease the index
		return a[t--];
	}

	//peek the top element of the stack
	public String peek() {
		if (!isEmpty()) {
			return a[t];
		} else {
			System.exit(-1);
		}

		return null;
	}

	// return the maximum value in the stack currently. If there are no elements in
	// the stack, throw an error.
	public String maxValue() {
		if (!isEmpty()) {
			return a[t + 1];
		} else {
			System.out.println("empty Stack");
			System.exit(-1);
		}
		return null;
	}

	public boolean isEmpty() {
		return t == -1;
	}

	public boolean isFull() {
		return t == c - 1;
	}
}

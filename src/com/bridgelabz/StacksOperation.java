package com.bridgelabz;

public class StacksOperation {
	static Node top;

	public Node push(int data) {
		Node newNode = new Node(data);
		if (top == null) {
			top = newNode;
			return top;
		}
		newNode.next = top;
		top = newNode;
		return top;
	}

	public void pop () {
		if (top!=null) {
			System.out.println("Popped element is " + top.data);
		}
		top = top.next;
	}

	public void peak() {
		if (top != null) {
			System.out.println("Top of the stack is " + top.data);
		} else {
			System.out.println("No element left in the stack.");
		}
	}

	public void printStack() {
		if (top == null) {
			System.out.println("Stack is empty.");
			return;
		}
		Node temp = top;
		while (temp != null) {
			System.out.printf("%d->",temp.data);

			temp = temp.next;
		}
	}

}

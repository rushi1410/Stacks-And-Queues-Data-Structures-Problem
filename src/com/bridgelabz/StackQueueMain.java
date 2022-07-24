package com.bridgelabz;

public class StackQueueMain {
	public static void main(String[] args) {
		StacksOperation stack = new StacksOperation();
		stack.push( 70);
		stack.push(30);
		stack.push(56);
		stack.printStack();
		stack.peak();
	}
}

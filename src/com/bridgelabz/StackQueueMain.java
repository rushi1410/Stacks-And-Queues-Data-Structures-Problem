package com.bridgelabz;

public class StackQueueMain {
	public static void main(String[] args) {
		System.out.println("Stack Created:");
		StacksOperation stack = new StacksOperation();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		stack.printStack();
		
		stack.peak();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.printStack();

		System.out.println("\nQueue Created:");
		QueuesOperation queue = new QueuesOperation();
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);
		queue.printQueue();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.printQueue();
	}
}

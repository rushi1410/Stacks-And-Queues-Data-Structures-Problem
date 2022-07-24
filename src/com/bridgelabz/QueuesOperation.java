package com.bridgelabz;

public class QueuesOperation {
	static Node head;

	public void enqueue(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;

			while (temp.next != null) {
				temp = temp.next;
			}

			temp.next = newNode;
		}
	}


	public void printQueue(){
		if (head == null) {
			System.out.println("Queue is empty.\n");
		} else {
			Node temp = head;
			while (temp != null) {
				System.out.printf(" %d",temp.data);
				temp = temp.next;
			}

		}
	}
}

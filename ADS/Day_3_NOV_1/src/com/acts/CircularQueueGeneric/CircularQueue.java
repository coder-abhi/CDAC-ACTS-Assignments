package com.acts.CircularQueueGeneric;

public class CircularQueue implements CircularQueueInterface {

	int circularQueueArray[];
	int front;
	int rear;
	int size;

	public CircularQueue(int length) {
		super();
		this.circularQueueArray = new int[length+1];
		this.front = 0;
		this.rear = 0;
		this.size = length+1;
	}

	@Override
	public void addQ(int element) {
		if (!isFull()) {
			rear = (rear + 1) % size;
			circularQueueArray[rear] = element;

		} else
			System.out.println(" Dequeue is Full");
	}

	@Override
	public int deleteQ() {
		if (!isEmpty()) {
			front = (front + 1) % size;
			return circularQueueArray[front];
		} else
			System.out.println(" Dequeue is Empty");

		return -1;
	}

	@Override
	public boolean isFull() {
		if (front == (rear + 1) % size)
			return true;
		return false;
	}

	@Override
	public boolean isEmpty() {
		if (rear == front)
			return true;
		return false;
	}

}

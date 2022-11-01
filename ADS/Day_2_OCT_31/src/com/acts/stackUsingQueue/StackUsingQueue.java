package com.acts.stackUsingQueue;

public class StackUsingQueue implements StackInterface {
	Queue queueMain;
	Queue queueTemp;
	public int top;
	int size;

	// Constructor
	StackUsingQueue(int length) {
		this.size = length;
		queueMain = new Queue(length);
		queueTemp = new Queue(length);
		this.top = -1;
	}

	@Override
	public boolean isEmpty() {
		return queueMain.isEmpty();
	}

	@Override
	public boolean isFull() {
		return queueMain.isFull();
	}

	@Override
	public void push(int element) {
		if (!isFull()) {
			if (isEmpty()) {
				copy(this.queueMain, this.queueTemp);
				queueMain.addQ(element);
				copy(this.queueTemp, this.queueMain);
			}
			else if (!isEmpty())
			{
				queueMain.addQ(element);
			}
		} else
			System.out.println("Stack is Already Full!!");
	}

	@Override
	public int pop() {
		if (!isEmpty()) {
//			copy(this.queueMain,this.queueTemp);
			int resultEle = this.queueTemp.deleteQ();
			return resultEle;
		} else
			System.out.println("Stack is Already Empty!!");
		return -1;
	}

	private void copy(Queue q1, Queue q2) {
		while (!q1.isEmpty()) {
			q2.addQ(q1.deleteQ());
			q1.clear();
		}
	}

}

package com.acts.CircularQueue;

public class CircularQueueTester {

	public static void main(String[] args) {

		CircularQueue circularQueue = new CircularQueue(5);

		
		circularQueue.addQ(1);
		circularQueue.addQ(2);
		circularQueue.addQ(3);
		circularQueue.addQ(4);
		circularQueue.addQ(5);
		System.out.println(circularQueue.deleteQ());
		System.out.println(circularQueue.deleteQ());
		circularQueue.addQ(6);
		System.out.println(circularQueue.deleteQ());
		circularQueue.addQ(7);
		System.out.println(circularQueue.deleteQ());
		circularQueue.addQ(8);
		System.out.println(circularQueue.deleteQ());
		System.out.println(circularQueue.deleteQ());
		System.out.println(circularQueue.deleteQ());
		System.out.println(circularQueue.deleteQ());

	}

}

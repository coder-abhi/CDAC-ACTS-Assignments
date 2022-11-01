package linkedList;

public class LinkedList implements LinkedListInterface {
	Node head;

	public LinkedList() {
		super();
		this.head = null;
	}

	@Override
	public void addFirst(int element) {
		Node newNode = new Node(element);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	@Override
	public void printList() {
		Node current = head;
		if (head == null) {
			System.out.println("list is empty");
			return;
		}
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}

	}

}

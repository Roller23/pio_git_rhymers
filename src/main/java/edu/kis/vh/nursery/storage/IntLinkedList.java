package edu.kis.vh.nursery.storage;

public class IntLinkedList implements IntStorage {

	public IntLinkedList() {}

	private Node last;
	private int listSize = 0;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
		listSize++;
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return -1;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return -1;
		listSize--;
		int ret = last.getValue();
		last = last.prev;
		return ret;
	}

	public int size() {
		return listSize;
	}

}

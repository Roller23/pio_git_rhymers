package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {

	private static final int LOWER_BOUND = -1;
	private static final int MAX_SIZE = 12;
	private static final int DEFAULT_TOTAL = -1;
	private static final int NOT_FOUND = -1;

	private IntLinkedList numbers = new IntLinkedList();

	private int total = DEFAULT_TOTAL;

	public void countIn(final int in) {
		if (!isFull()) {
			numbers.push(in);
			total++;
		}
	}

	public boolean callCheck() {
		return total == LOWER_BOUND;
	}
		
	public boolean isFull() {
		return total == MAX_SIZE - 1;
	}
		
	public int peekaboo() {
		if (callCheck())
			return NOT_FOUND;
		return numbers.top();
	}
			
	public int countOut() {
		if (callCheck())
			return NOT_FOUND;
		total--;
		return numbers.pop();
	}

	public int getTotal() {
		return total;
	}

}

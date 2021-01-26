package edu.kis.vh.nursery.storage;

public class IntArrayStack implements IntStorage {
  private static final int LOWER_BOUND = -1;
	private static final int MAX_SIZE = 12;
	private static final int DEFAULT_TOTAL = -1;
	private static final int NOT_FOUND = -1;

	private final int[] numbers = new int[MAX_SIZE];

	private int total = DEFAULT_TOTAL;

	public void countIn(final int in) {
		if (!isFull())
		numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == LOWER_BOUND;
	}
		
	public boolean isFull() {
		return total == MAX_SIZE-1;
	}
		
	public int peekaboo() {
		if (callCheck())
			return NOT_FOUND;
		return numbers[total];
	}
			
	public int countOut() {
		if (callCheck())
			return NOT_FOUND;
		return numbers[total--];
	}

	public int getTotal() {
		return total;
	}

	public void push(int in) {
		countIn(in);
	}

	public int top() {
		return peekaboo();
	}

	public int pop() {
		return countOut();
	}

	public int size() {
		return total;
	}

	public boolean isEmpty() {
		return callCheck();
	}

}
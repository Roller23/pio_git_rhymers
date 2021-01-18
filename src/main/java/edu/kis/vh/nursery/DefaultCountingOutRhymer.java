package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int LOWER_BOUND = -1;
	private static final int MAX_SIZE = 12;

	private final int[] NUMBERS = new int[MAX_SIZE];

	private int total = -1;

	protected void countIn(final int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	protected boolean callCheck() {
		return total == LOWER_BOUND;
	}
		
	protected boolean isFull() {
		return total == MAX_SIZE-1;
	}
		
	protected int peekaboo() {
		if (callCheck())
			return -1;
		return NUMBERS[total];
	}
			
	protected int countOut() {
		if (callCheck())
			return -1;
		return NUMBERS[total--];
	}

	protected int getTotal() {
		return total;
	}

}

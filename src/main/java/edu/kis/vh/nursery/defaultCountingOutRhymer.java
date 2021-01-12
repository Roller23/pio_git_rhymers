package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int LOWER_BOUND = -1;
	public static final int MAX_SIZE = 12;

	private int[] NUMBERS = new int[MAX_SIZE];

	public int total = -1;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	public boolean callCheck() {
		return total == LOWER_BOUND;
	}
		
	public boolean isFull() {
		return total == MAX_SIZE-1;
	}
		
	protected int peekaboo() {
		if (callCheck())
			return -1;
		return NUMBERS[total];
	}
			
	public int countOut() {
		if (callCheck())
			return -1;
		return NUMBERS[total--];
	}

}

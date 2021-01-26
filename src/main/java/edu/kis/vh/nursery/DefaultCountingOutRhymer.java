package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntArrayStack;

public class DefaultCountingOutRhymer {

	private final IntArrayStack numbers = new IntArrayStack();

		public void countIn(final int in) {
			numbers.countIn(in);
		}

		public boolean callCheck() {
			return numbers.callCheck();
		}
			
		public boolean isFull() {
			return numbers.isFull();
		}
			
		public int peekaboo() {
			return numbers.peekaboo();
		}
				
		public int countOut() {
			return numbers.countOut();
		}

		public int getTotal() {
			return numbers.getTotal();
		}

}

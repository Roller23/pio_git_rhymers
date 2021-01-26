package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.IntArrayStack;
import edu.kis.vh.nursery.storage.IntStorage;

public class DefaultCountingOutRhymer {

	private final IntStorage numbers = new IntArrayStack();

		public void countIn(final int in) {
			numbers.push(in);
		}

		public boolean callCheck() {
			return numbers.isEmpty();
		}
			
		public boolean isFull() {
			return numbers.isFull();
		}
			
		public int peekaboo() {
			return numbers.top();
		}
				
		public int countOut() {
			return numbers.pop();
		}

		public int getTotal() {
			return numbers.size();
		}

}

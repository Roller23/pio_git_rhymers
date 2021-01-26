package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.IntArrayStack;
import edu.kis.vh.nursery.storage.IntStorage;

/**
 * Rhymer implementing a FIFO queue
 */

public class FIFORhymer extends DefaultCountingOutRhymer {

	private final IntStorage temp = new IntArrayStack();
	/**
	 * @param none
	 * @return int
	 */
	@Override
	public int countOut() {
		while (!callCheck())
			temp.push(super.countOut());
		
		int ret = temp.pop();
		
		while (!temp.isEmpty())
			countIn(temp.pop());
		
		return ret;
	}
}


// IntArrayStack appears to be better suited for this task
// because it never needs to insert values in the middle of the collection
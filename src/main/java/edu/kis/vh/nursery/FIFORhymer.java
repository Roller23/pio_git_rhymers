package edu.kis.vh.nursery;

/**
 * Rhymer implementing a FIFO queue
 */

public class FIFORhymer extends DefaultCountingOutRhymer {

	private DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();
	/**
	 * @param none
	 * @return int
	 */
	@Override
	protected int countOut() {
		while (!callCheck())
			temp.countIn(super.countOut());
		
		int ret = temp.countOut();
		
		while (!temp.callCheck())
			countIn(temp.countOut());
		
		return ret;
	}
}

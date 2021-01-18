package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;
import java.util.Random;

class RhymersDemo {
	private static int testRhymers(DefaultCountingOutRhymer[] rhymers) {
		for (int i = 1; i < 15; i++)
			for (int j = 0; j < 3; j++)
				rhymers[j].countIn(i);

		Random rn = new Random();
		for (int i = 1; i < 15; i++)
			rhymers[3].countIn(rn.nextInt(20));

		for (int i = 0; i < rhymers.length; i++) {
			while (!rhymers[i].callCheck())
				System.out.print(rhymers[i].countOut() + "  ");
			System.out.println();
		}
		return ((HanoiRhymer)rhymers[3]).reportRejected();
	}

	public static void main(String[] args) {
		Rhymersfactory factory = new DefaultRhymersFactory();
		DefaultCountingOutRhymer[] rhymers = {
			factory.getStandardRhymer(),
			factory.getFalseRhymer(),
			factory.getFIFORhymer(),
			factory.getHanoiRhymer()
		};
		
		System.out.println("total rejected is " + testRhymers(rhymers));
	}
	
}
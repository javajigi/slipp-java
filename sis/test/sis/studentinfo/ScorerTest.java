package sis.studentinfo;

import junit.framework.TestCase;

public class ScorerTest extends TestCase {
	public void testCaptureScore() throws Exception {
		Scorer scorer = new Scorer();
		assertEquals(75, scorer.score("75"));
	}

}

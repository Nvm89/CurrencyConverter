package Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConcateTest {

	@Test
	public void testConcatenate() {
		junit test = new junit();
		String result = test.concatenate("one","two");
		assertEquals("onetwo",result);
	}

}

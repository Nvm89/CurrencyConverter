package Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplayTest {

	@Test
	public void testMultiplay() {
		junit test = new junit();
		int result = test.multiply(3, 4);
		assertEquals(12,result);
	}

}

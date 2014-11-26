package domain.oracle.com;

import static org.junit.Assert.*;

import java.util.concurrent.CountDownLatch;

import org.junit.Test;

public class TestContatore {

	
	@Test
	public void testInitialCounterValue() {
		Count count = new Count();
		assertEquals(0, count.value());
	}
	
	
	@Test
	public void testScnarioIncremento() {
		Count count = new Count();
		assertEquals(0, count.value());
		count.increment();
		assertEquals(1, count.value());
	}

}

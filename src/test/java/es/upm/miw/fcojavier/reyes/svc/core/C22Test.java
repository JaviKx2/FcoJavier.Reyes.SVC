package es.upm.miw.fcojavier.reyes.svc.core;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C22Test {
	C22 c22;

	@Before
	public void init() {
		c22 = new C22();
	}
	
	@Test
	public void testM1() {	
		assertEquals("mA", c22.mA());
	}
}

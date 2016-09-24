package es.upm.miw.fcojavier.reyes.svc.core;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C12Test {
	C12 c12;

	@Before
	public void init() {
	    c12 = new C12();
	}
	
	@Test
	public void testM1() {	
		assertEquals("mA", c12.mA());
	}
}
